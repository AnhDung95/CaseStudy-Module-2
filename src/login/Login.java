package login;

import account.*;
//import storage.ReadWriteFile;
//import system.RunByAdmin;
//import system.RunByUser;
import validate.Validate;
import view.HomePage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {

    private Validate validate = new Validate();
    private AccountAdmin accountAdmin = new AccountAdmin();
//    private NewAccount newAccount = new NewAccount();
    Scanner scanner = new Scanner(System.in);
    public Login() {
    }
    public void menuLogin() {
        do {
            System.out.println("╔============================================╗");
            System.out.println("║   ▂ ▃ ▅ ▆ █   TAM TRINH CAFE  █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠============================================╣");
            System.out.println("║>[1]. Đăng nhập                             ║");
            System.out.println("║>[0]. Thoát                                 ║");
            System.out.println("╚============================================╝");
            System.out.print("[\uD83D\uDC4B] Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                    break;
            }
        } while (true);
    }
    public void loginManager(){
        try{
            System.out.println("┎──────────────[ĐĂNG NHẬP]──────────────┒");
            System.out.print("┠ ▹ Nhập tài khoản: ");
            String account = scanner.nextLine();
            System.out.print("┠ ▹ Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("┖───────────────────────────────────────┚");
            checkAccount(account,password);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void checkAccount(String account, String password){
        try {
            if (checkAccountAdmin(account,password)){
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi ADMIN thành công !!!");
                System.out.println("------------------------------------------------------------");
                HomePage home = new HomePage();
                home.showPage();
                home.action();
            }
            else {
                System.err.println("");
                System.out.println("--- Tên đăng nhập hoặc mật khẩu không đúng! Mời nhập lại: ---");
                System.out.println("-------------------------------------------------------------");
                loginManager();
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }
    public boolean checkAccountAdmin(String name, String password){
        for (AccountAdmin accAdmin : accountAdmin.getAccountsAdminList()){
            boolean check = name.equals(accAdmin.getAdminName()) && password.equals(accAdmin.getAdminPassword());
            if (check){
                return true;
            }
        }
        return false;
    }
//    public void creatAccount(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("┎──────────────[ĐĂNG KÝ]──────────────┒");
//        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
//        System.out.println("--------------------------------------");
//        String accountName = checkAccountName();
//        String accountPassword = checkPassword();
//        System.out.print("┠ ▹ Nhập tên: ");
//        String name = scanner.nextLine();
//        System.out.print("┠ ▹ Nhập địa chỉ: ");
//        String address = scanner.nextLine();
//        System.out.println("┖─────────────────────────────────────┚");
//    }
//    public String checkAccountName() {
//        String accountUser;
//        while (true) {
//            System.out.print("┠ ▹ Nhập tài khoản (8 - 12 ký tự (a,1,...): ");
//            String account = scanner.nextLine();
//            if (!validate.validateAccount(account)) {
//                System.out.println("[❌] Tài khoản không hợp lệ !!!");
////                System.out.println(">[Chú ý]: Tài khoản phải từ 8 - 12 ký tự (a,1,...)");
//                System.out.println("---------------------------------------------------");
//            } else {
//                accountUser = account;
//                break;
//            }
//        }
//        return accountUser;
//    }
//    public String checkPassword() {
//        String passwordUser;
//        while (true) {
//            System.out.print("┠ ▹ Nhập passwword (8 - 16 ký tự (a,A,1,...)): ");
//            String password = scanner.nextLine();
//            if (!validate.validatePassword(password)) {
//                System.out.println("[❌] Mật khẩu không hợp lệ !!!");
////                System.out.println(">[Chú ý]: Mật khẩu phải từ 8 - 16 ký tự (a,A,1,...)hoặc ký tự đặc biệt");
//                System.out.println("-----------------------------------------");
//            } else {
//                passwordUser = password;
//                break;
//            }
//        }
//        return passwordUser;
//    }
}