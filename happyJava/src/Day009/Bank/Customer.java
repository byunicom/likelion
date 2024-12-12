package dgkim.P1212.Bank;
//고객ID와 이름 포함하며, 고객이 소유한 통장(Account) 목록 관리
public class Customer {
    int id;
    String name;
    String accountNo;

    public Customer(){  }

    public void showAccount(){
        System.out.println("계좌번호는 "+accountNo+", 고객 아이디는 "+id+", 성명은 "+name+" 입니다.");
    }

}
