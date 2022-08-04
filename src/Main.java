import view.HomePage;
import view.OrderPage;

public class Main {
    public static void main(String[] args) {
//        new login.Login().loginSystem();
        HomePage home = new HomePage();
        home.showPage();
        home.action();
    }
}
