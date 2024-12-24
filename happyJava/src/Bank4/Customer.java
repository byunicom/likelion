package Bank4;

import java.util.Scanner;

public class Customer {


    public void addCustomer(){
        Scanner sc = new Scanner(System.in);

        System.out.println("┌─────────────────────┐");
        System.out.println("│   * New Customer *  │");
        System.out.println("└─────────────────────┘");
        System.out.println("1. 성명(Name) > ");
        String name = sc.nextLine();
        System.out.println("2. 휴대폰(PhoneNumber) > -는 제외하고 숫자만 입력해주세요.");
        String phoneNumber = sc.nextLine();
        System.out.println("고객님의 성명은 ["+name+"] 이며, 휴대폰번호는 ["+phoneNumber+"] 번 입니다.");
        //addComplete(name, phoneNumber);
//        sc.close();
    }

    public void addComplete(String name, String phoneNumber){

        System.out.println("고객님의 성명은 ["+name+"] 이며, 휴대폰번호는 ["+phoneNumber+"] 번 입니다.");

        //addContinue();
    }

//    public void addContinue(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("------------------------");
//        System.out.println("고객 등록을 계속하시겠습니까? (Y / N)");
//        String confirm = sc.nextLine();
//        if(confirm.equals("Y") || confirm.equals("y")){
//            addCustomer();
//        }else if(confirm.equals("N") || confirm.equals("n")){
////            mainMenu();
//        }else{
//            System.out.println("잘못 입력하셨습니다. Y 또는 N 을 입력해 주세요.");
//            addContinue();
//        }
//    }
}
