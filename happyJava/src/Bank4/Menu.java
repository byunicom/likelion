package Bank4;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Menu {

    private Integer num = null;



    public Menu(){
        start();
        mainMenu();
    }

    public void start(){
//        Timer timer = new Timer();
//
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                mainMenu();
//            }
//        };

        System.out.println("'//////////////////////////////.");
        System.out.println("'/    Welcome Lion's Bank     /.");
        System.out.println("'//////////////////////////////.");
        System.out.println();
        System.out.println();

//        timer.schedule(timerTask,1000);
    }

    public void mainMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 라이온 은행 시스템 ===");
        System.out.println("1.\t고객 등록");
        System.out.println("2.\t계좌 생성");
        System.out.println("3.\t입금");
        System.out.println("4.\t출금");
        System.out.println("5.\t잔액 조회");
        System.out.println("6.\t종료");
        System.out.println("========================");


        System.out.println("메뉴 번호를 입력해주세요 > ");
//        Integer num = null;
        String input = sc.nextLine();

        num = Integer.parseInt(input);

        selMenu(num);
    }

    public void selMenu(Integer num) {
        Customer customer = new Customer();
        Account account = new Account();
        boolean status=false;

        while(!status){
            switch (num) {
                case 1:
//                    System.out.println("고객 등록 메뉴를 선택하셨습니다.");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("┌─────────────────────┐");
                    System.out.println("│   * New Customer *  │");
                    System.out.println("└─────────────────────┘");
                    System.out.println("1. 성명(Name) > ");
                    String name = sc.nextLine();
                    System.out.println("2. 휴대폰(PhoneNumber) > -는 제외하고 숫자만 입력해주세요.");
                    String phoneNumber = sc.nextLine();
                    System.out.println("고객님의 성명은 ["+name+"] 이며, 휴대폰번호는 ["+phoneNumber+"] 번 입니다.");


                    customer.addCustomer();
                    break;
                case 2:
                    System.out.println("계좌 생성 메뉴를 선택하셨습니다.");
                    //account.addAccount();
                    break;
                case 3:
                    System.out.println("입금 메뉴를 선택하셨습니다..");
                    break;
                case 4:
                    System.out.println("출금 메뉴를 선택하셨습니다.");
                    break;
                case 5:
                    System.out.println("잔액 조회 메뉴를 선택하셨습니다.");
                    break;
                case 6:
                    System.out.println("종료를 선택하셨습니다.");
                    status=true;
                    break;
                default:
                    System.out.println("메뉴는 1~6번 까지만 선택가능합니다.");
            }
        }
    }
}
