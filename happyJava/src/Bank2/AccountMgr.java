package Bank2;

import java.util.Scanner;

public class AccountMgr {
    //클래스 변수
    static Account[] accounts = new Account[100];
    static int index =0;

    public AccountMgr(){

    }

    //계좌 개설
    public static void createAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("계좌번호 : ");
        String accountNumber = scan.nextLine();

        System.out.println("이름 : ");
        String name = scan.nextLine();

        System.out.println("비밀번호 : ");
        String pwd = scan.nextLine();

        System.out.println("잔고 : ");
        int balance = Integer.parseInt(scan.nextLine());

        Account account = new Account(accountNumber, name, pwd, balance);
        accounts[index++] = account;
    }

    public static void retrieveAccount(){
        for(int i = 0; i< index; i++){
            accounts[i].printAccounts();
        }
    }

    public static void credit(){
        Scanner scan = new Scanner(System.in);

        System.out.println("계좌번호 : ");
        String accountNumber = scan.nextLine();

        Account account = findAccountByAccountNumber(accountNumber);
        if(account == null){
            System.out.println("계좌번호를 정확히 입력해주세요.");
//            return; //메소드를 빠져나올때 사용한다.
        }

        System.out.println("금액 : ");
        int amount = Integer.parseInt(scan.nextLine());

        account.deposit(amount);
        System.out.println("입금이 완료되었습니다.");

    }

    //계좌번호에 해당하는 고객계좌를 조회한다.
    public static Account findAccountByAccountNumber(String accountNumber){
        for(int i = 0; i< index; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    public static void devit(){
        Scanner scan = new Scanner(System.in);

        System.out.println("계좌번호 : ");
        String accountNumber = scan.nextLine();

        Account account = findAccountByAccountNumber(accountNumber);
        if(account==null){
            System.out.println("계좌번호를 정확히 입력해 주세요.");
//            return;
        }

        System.out.println("금액 : ");
        int amount = Integer.parseInt(scan.nextLine());

        account.withdraw(amount);
        System.out.println("출금이 완료되었습니다.");

    }

    public static void retrieveBalance(){
        Scanner scan = new Scanner(System.in);

        System.out.println("계좌번호 : ");
        String accountNumber = scan.nextLine();

        Account account = findAccountByAccountNumber(accountNumber);
        if(account == null){
            System.out.println("계좌번호를 입력해주세요.");
        }

        System.out.printf("잔액 : %,d원%n", account.getBalance());
    }

    public static void main(String[] args) {
        boolean isExit = false;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("=======은행 입출금 관리 시스템========");
            System.out.println("1. 계좌 개설");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 잔액조회");
            System.out.println("5. 전체 계좌 조회");
            System.out.println("6. 종료");
            System.out.println("항목을 입력하세요.");

            int menu = Integer.parseInt(scan.nextLine());
            switch (menu){
                case 1: //계좌개설
                    createAccount();
                    break;
                case 2: //입금
                    credit();
                    break;
                case 3: //출금
                    devit();
                    break;
                case 4: //잔액조회
                    retrieveBalance();
                    break;
                case 5: //전체 계좌 조회
                    retrieveAccount();
                    break;
                case 6: //종료
                    isExit = true;
                    break;
            }
        }while(isExit);
    }
}
