import view.HomePage;
import account.Login;
public class Main {
    public static void main(String[] args) {
        Login LG=new Login();
        LG.run();

//        new account.Login().loginSystem();
        HomePage home = new HomePage();
        home.showPage();
        home.action();
    }
}
