package view;

import model.Bill;

import java.io.Serializable;
import java.util.Scanner;
public class HomePage implements Serializable {
    public  Bill bill;

    public  void showPage() {
        System.out.println("---TRANG CHỦ ---");
        System.out.println("1. Tạo đơn hàng");
        System.out.println("2. Xem đơn hàng");
        System.out.println("3. Thoát");
        System.out.print("Nhập yêu cầu: " + "\n");
    }

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String act = scanner.nextLine();
        while (!(act.equals("3"))) {
            switch (act) {
                case "1":
                    OrderPage.showOrderPage();
                    bill = OrderPage.action(scanner);
                    showPage();
                    break ;
                case "2":
                    System.out.println("Hóa đơn của khách");
                    if (bill != null) {
                        System.out.println("Hóa đơn số: " + bill);
                    }
                    break;
                default:
                    System.out.print("Vui lòng nhập lại: " + "\n");
                    showPage();
            }
            act = scanner.nextLine();
        }
    }

    public void deleteDrink(Long id) {
        OrderPage.items.removeAll(OrderPage.items);
    }

}