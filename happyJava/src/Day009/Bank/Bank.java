package dgkim.P1212.Bank;

import java.sql.Array;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        String accountNo;
        String name;
        int id;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 라이온 은행 시스템 ===");
        System.out.println("1.\t고객 등록");
        System.out.println("2.\t계좌 생성");
        System.out.println("3.\t입금");
        System.out.println("4.\t출금");
        System.out.println("5.\t잔액 조회");
        System.out.println("6.\t종료");
        //scanner.nextInt();

        try {
            scanner.nextInt();
        } catch (Exception e) {
//            throw new RuntimeException(e);
            //System.out.println(e.getMessage());
            System.out.println("숫자를 입력하세요.");
        }

        for(int i=0;i< customers.length;i++){
            customers[i] = new Customer();
        }

        customers[0].accountNo="123456789";
        customers[0].name="dgkim";
        customers[0].id=1;

        customers[1].accountNo="987654321";
        customers[1].name="byunicom";
        customers[1].id=2;

        customers[2].accountNo="123789456";
        customers[2].name="toysh";
        customers[2].id=3;

        for(int i=0;i< customers.length;i++){
            id=customers[i].id;
            accountNo=customers[i].accountNo;
            name=customers[i].name;
//            System.out.println(customers[i].accountNo);
//            System.out.println("계좌번호는 "+accountNo+", 고객 아이디는 "+id+", 성명은 "+name+" 입니다.");
        }
    }

    public void addCustomer(){

    }

    public void findCustomer(){

    }

}
