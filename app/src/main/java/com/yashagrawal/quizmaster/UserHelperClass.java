package com.yashagrawal.quizmaster;

public class UserHelperClass {
    String fname,uname,emailid,phone,pass;

    public UserHelperClass(String fname, String uname, String emailid, String phone, String pass) {
        this.fname = fname;
        this.uname = uname;
        this.emailid = emailid;
        this.phone = phone;
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
