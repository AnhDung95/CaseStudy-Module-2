package account;

import controller.ManagerUser;
import view.HomePage;

import java.util.Scanner;

public class Login  {
    public Scanner scanner = new Scanner(System.in);
    private ManagerUser userManagement = new ManagerUser();
    ;


    public void run() {
        int choice = -1;

        menu();
        System.out.println("Nhập lựa chọn của bạn");
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1: {
                doLogin();
                break;
            }
            case 2: {
                doRegister();
                break;
            }
            case 0:

        }
    }
    private  void doLogin() {
        HomePage homePage=new HomePage();
        System.out.println("Nhập tài khoản: ");
        String acount = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String passwork = scanner.nextLine();
//        System.out.println("Nhập số tiền muốn nạp");
//        int monney = scanner.nextInt();
        boolean isLogin = userManagement.checkUserLogin(acount, passwork);
        if (isLogin){
            System.out.println("Đang nhập thành công");
            homePage.showPage();

        }else {
            System.err.println("Tài khoản hoặc mật khẩu không đúng");
            doLogin();
        }
    }

    private void doRegister() {
        System.out.println("Đăng kí tài khoản");
        User user = createUser();
        userManagement.register(user);
    }

    private User createUser() {
        String acount = inputAcount();
        String password = inputPasswork();
//        int monney =inputMonney();
        User user = new User(acount, password);
        return user;
    }
    private String inputPasswork() {
        String password;
        do {
            System.out.println("Nhập mật khẩu(6-12 kí tự):");
            password = scanner.nextLine();
            if (password.length() < 6 || password.length() > 12) {
                System.err.println("Mật khẩu không hợp lệ");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (password.length() < 6 || password.length() > 12);
        return password;
    }

    private String inputAcount() {
        String username;
        do {
            System.out.println("Nhập tài khoản(6-12 kí tự):");
            username = scanner.nextLine();
            if (username.length() < 6 || username.length() > 12) {
                System.err.println("Tài khoản không hợp lệ");
            } else if (userManagement.checkUsernameExist(username)) {
                System.err.println("Tài khoản này đã tồn tại");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (username.length() < 6 || username.length() > 12 || userManagement.checkUsernameExist(username));
        return username;
    }
//    private int inputMonney(){
//        int monney;
//
//        System.out.println("Nhập số tiền muốn nạp");
//        monney =scanner.nextInt();
//        return monney;
//    }

    public static void menu() {
        System.out.println("---Tam Trinh Cafe---");
        System.out.println("1.Đăng nhập");
        System.out.println("2.Đăng kí");
        System.out.println("0.Thoát");
    }

}
