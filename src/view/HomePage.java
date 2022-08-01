package view;

import java.util.Scanner;

public class HomePage {
    public void showPage() {
        System.out.println("---HOME PAGE ---");
        System.out.println("1. New Order");
        System.out.println("2. View Orders");
        System.out.println("3. Quit");
    }

    public void action() {
        Scanner sc = new Scanner(System.in);
        String act = sc.nextLine();
        while (!(act.equals("3"))) {
            switch (act) {
                case "1":
                    System.out.println("Please order");
                    break;
                case "2":
                    System.out.println("This is orders");
                    break;
                default:
                    System.out.println("Please re-enter");
                    showPage();
            }
            act = sc.nextLine();
        }
    }
}
