package view;

import controller.DrinkController;
import model.Bill;
import model.BillItem;
import model.Drink;
import storage.IOFileBinary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderPage implements Serializable {
    private static final DrinkController controller = DrinkController.getInstance();
    private static IOFileBinary<BillItem> ioFileBinary= IOFileBinary.getInstance();
    public static List<BillItem> items = new ArrayList<>();
    private static HomePage hp = new HomePage();

    public static void showOrderPage() {

        System.out.println("--- PLEASE ORDER ---");
        System.out.println("0. Trở về trang chủ");
        List<Drink> menu = controller.getMenu();

        for (Drink d : menu) {
            System.out.println(d);
        }
        System.out.print("Chọn đồ uống: ");
        for (int i = 0; i < menu.size(); i++) {
            Scanner scanner=new Scanner(System.in);
             OrderPage.action(scanner);
        }
    }
    public static Bill action(Scanner sc) {
        String act = sc.nextLine();
        Bill b = new Bill(1L);
        while (!act.equals("0")) {
            Drink d = controller.findDrinkById(Long.valueOf(act));
            System.out.println("Bạn chọn " + d.getCategory().getName());
            System.out.print("Nhập số lượng: ");
            String q = sc.nextLine();
            items.add(new BillItem(1L, b.getId(), d, Integer.valueOf(q)));
            ioFileBinary.writeFile("student.jmn", (ArrayList<BillItem>) items);
            System.out.print("Tiếp tục?: [y/n] ");
            String c = sc.nextLine();
            System.out.println("-----------------------------");
            if (c.equals("y")) {
                System.out.println("a. Tiếp tục chọn số để chọn thêm đồ uống: "+"\n");
                System.out.println("b. Xóa đơn vừa tạo: ");
                act =sc.nextLine();
                if(act.equals("b")) {
                    HomePage homePage = new HomePage();
                    homePage.deleteDrink(1L);
                    homePage.deleteDrink(2L);
                    homePage.deleteDrink(3L);
                    homePage.deleteDrink(4L);
                    homePage.deleteDrink(5L);
                    homePage.deleteDrink(6L);
                    homePage.deleteDrink(7L);
                    homePage.deleteDrink(8L);
                    homePage.deleteDrink(9L);
                    showOrderPage();
                }
            } else {
                b.setItems(items);
                System.out.println("Hóa đơn số: "+b);
                System.out.println("Tổng tiền: "+ OrderPage.getSum(items));
                act = "0";
            }
            System.out.println("Quay lại");
            hp.bill = b;
            hp.showPage();
            hp.action();
        }
        return b ;
    }
    public static int getSum(List<BillItem> items) {
        int sum =0;
        for (int i = 0; i < items.size(); i++) {
             sum += items.get(i).getTotalPrice();
        }
        return sum;
    }

}