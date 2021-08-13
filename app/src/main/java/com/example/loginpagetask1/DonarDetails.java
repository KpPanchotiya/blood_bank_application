package com.example.loginpagetask1;

public class DonarDetails {
    private String a_dname;
    private String a_dno;
    private String a_dbloodtype;

    public DonarDetails(String a_dname, String a_dno, String a_dbloodtype) {
        this.a_dname = a_dname;
        this.a_dno = a_dno;
        this.a_dbloodtype = a_dbloodtype;
    }

    public String getA_dname() {
        return a_dname;
    }

    public void setA_dname(String a_dname) {
        this.a_dname = a_dname;
    }

    public String getA_dno() {
        return a_dno;
    }

    public void setA_dno(String a_dno) {
        this.a_dno = a_dno;
    }

    public String getA_dbloodtype() {
        return a_dbloodtype;
    }

    public void setA_dbloodtype(String a_dbloodtype) {
        this.a_dbloodtype = a_dbloodtype;
    }
}
