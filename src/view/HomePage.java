package view;

import java.util.Scanner;

public class HomePage {
    public void showPage() {
        System.out.println("---TRANG CHỦ ---");
        System.out.println("1. Tạo đơn mới");
        System.out.println("2. Xem đơn hàng");
        System.out.println("3. Thoát");
        System.out.print("Nhập yêu cầu: ");
    }

    public void action() {
        Scanner scanner = new Scanner(System.in);
        String act = scanner.nextLine();
        while (!(act.equals("3"))) {
            switch (act) {
                case "1":
                    OrderPage.showPage();
                    OrderPage.action(scanner);
                    showPage();
                    break;
                case "2":
                    System.out.print("Đồ uống của khách");
                    showPage();
                    break;
                default:
                    System.out.print("Vui lòng nhập lại: ");
                    showPage();
            }
            act = scanner.nextLine();
        }
    }
}