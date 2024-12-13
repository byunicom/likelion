package Bank;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BankMain {
//    public Bank[] banks = new Bank[1];
    public static int FINAL_ID;
    public static String NAME;
    public static String PHONE_NUMBER;
    static BankMain[] bankMains = new BankMain[1];


    public BankMain(Integer id, String name, String phoneNumber){
        FINAL_ID=id;
        NAME=name;
        PHONE_NUMBER=phoneNumber;
    }
    public static void main(String[] args) {

//        Timer timer = new Timer();
//
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                Menu menu = new Menu();
//            }
//        };



        System.out.println("'//////////////////////////////.");
        System.out.println("'/    Welcome Lion's Bank     /.");
        System.out.println("'//////////////////////////////.");
        System.out.println();
        System.out.println();

        Menu menu = new Menu();

//        timer.schedule(timerTask,500);

    }
}
