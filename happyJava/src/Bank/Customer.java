package Bank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static Bank.BankMain.FINAL_ID;
import static Bank.BankMain.bankMains;

//고객ID와 이름 포함하며, 고객이 소유한 통장(Account) 목록 관리
public class Customer extends Bank{

    private Scanner sc = new Scanner(System.in);

    public Customer(){  }
    public int newId;

    public static Bank[] setSizeStringArray(Bank[] srcArray, int size){
        //배열 증가 시키기
        Bank[] newArray = Arrays.copyOf(srcArray, size);
        return newArray;
    }

    public void addCustomer(){
        System.out.println("누적 고객수 : "+FINAL_ID);
        for(int i=0;i<FINAL_ID;i++){

        }

        System.out.println("┌─────────────────────┐");
        System.out.println("│   * New Customer *  │");
        System.out.println("└─────────────────────┘");
        System.out.println("1. 성명(Name) > ");
        String name = sc.nextLine();
        System.out.println("2. 휴대폰(PhoneNumber) > -는 제외하고 숫자만 입력해주세요.");
        String phoneNumber = sc.nextLine();

        addComplete(name, phoneNumber);

    }

    public void addComplete(String name, String phoneNumber){

        int idNum;
        if(id==null){
            idNum=1;
        }else{
            idNum= getId() + 1;
        }
        FINAL_ID=FINAL_ID+1;



        banks = setSizeStringArray(banks, FINAL_ID);

        System.out.println(idNum);



//        bankMains[idNum-1]= new BankMain(idNum, name, phoneNumber);
        //bankMains = Arrays.copyOf(banks, banks.length);

//        for(int i=0; i< bankMains.length;i++){
//            System.out.println("복사한 값: "+banks[i].id.toString());
//        }
//        for(int i=0;i< banks.length;i++){
////            System.out.println("%%%%%%%%"+banks[i].id);
////            setId(idNum);
////            setName(name);
////            setPhoneNumber(phoneNumber);
//
//        }

        System.out.println("banks.length : "+banks.length);

//        for(int i=0;i< banks.length;i++){
//            System.out.println(banks[i].id);
//        }

        System.out.println("고객님의 성명은 ["+name+"] 이며, 휴대폰번호는 ["+phoneNumber+"] 번 입니다.");
        System.out.println("고객 등록이 완료되었습니다. 총 누적 고객수는 "+FINAL_ID+" 입니다.");



//        for(int i=0;i<bankMains.length;i++){
//            System.out.println("id : "+Arrays.toString(bankMains)+",name : "+getName()+",phoneNumber : "+getPhoneNumber());
//        }



        addContinue();
    }

    public void addContinue(){
        System.out.println("------------------------");
        System.out.println("고객 등록을 계속하시겠습니까? (Y / N)");
        String confirm = sc.nextLine();
        if(confirm.equals("Y") || confirm.equals("y")){
            this.addCustomer();
        }else if(confirm.equals("N") || confirm.equals("n")){
            Menu menu = new Menu();
        }else{
            System.out.println("잘못 입력하셨습니다. Y 또는 N 을 입력해 주세요.");
            addContinue();
        }
    }
}
