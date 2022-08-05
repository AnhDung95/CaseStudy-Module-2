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
            System.out.println("║   ▂ ▃ ▅ ▆ █  TIMELINE COFFEE  █ ▆ ▅ ▃ ▂    ║");
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
            System.out.print("┠ ▹ Nhập tài khoản: "                       );
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
}