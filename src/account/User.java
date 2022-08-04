package account;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -6929331579373298011L;
    private String acount;
    private String passwork;
    private int monney;


    public User(String acount, String passwork) {
        this.acount = acount;
        this.passwork = passwork;
        this.monney = monney;
    }

    public String getAcount() {
        return acount;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }




    @Override
    public String toString() {
        return "acount: " + acount + ", " +
                " passwork: " + passwork + ", "
                ;

    }
}
