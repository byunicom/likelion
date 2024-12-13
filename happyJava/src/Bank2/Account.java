package Bank2;

public class Account {
    private String accountNumber;   //계좌번호
    private String name;    //이름
    private String pwd;     //비밀번호
    private int balance;    //잔고

    //디폴트 생성자
    public Account(){

    }
    //입금하다.
    public void deposit(int amount){
        this.balance +=amount;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    //잔고 get
    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getPwd() {
        return this.pwd;
    }

    //출금하다
    public void withdraw(int amount){
        this.balance-=amount;
    }

    public void printAccounts(){
        System.out.printf("계좌번호 : %s, 이름 : %s, 비밀번호 : %s, 잔고 : %,d원%n",accountNumber, name, pwd, balance);
    }

    //매개변수 생성자 메소드
    public Account(String accountNumber, String name, String pwd, int balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }

}
