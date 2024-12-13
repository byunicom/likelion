package Bank;

import java.util.Scanner;

public class Bank {
    public Integer id;
    public String phoneNumber;
    public String name;
    Bank[] banks = new Bank[1];

    public Bank(){  }

//    public void setBanks(Bank[] banks) {
//        this.banks = banks;
//    }


    public Bank(Integer id, String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public void setName(String name) {
        this.name = name;

    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
