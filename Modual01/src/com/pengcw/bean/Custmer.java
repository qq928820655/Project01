package com.pengcw.bean;

import java.util.ArrayList;
import java.util.List;

public class Custmer {
    private int Custmerid;
    private String Custmerno;
    private String CustmerName;
    private String pengcw;

    public static void main(String[] args) {
        List newlist = new ArrayList<>();
        System.out.println("HelloWorld111");
        newlist.add(0, 12);
    }

    public int getCustmerid() {
        return Custmerid;
    }

    public void setCustmerid(int custmerid) {
        custmerid = custmerid;
    }

    public String getCustmerno() {
        return Custmerno;
    }

    public void setCustmerno(String custmerno) {
        Custmerno = custmerno;
    }

    public String getCustmerName() {
        return CustmerName;
    }

    public void setCustmerName(String custmerName) {
        CustmerName = custmerName;
    }
}
