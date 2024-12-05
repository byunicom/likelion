package Day004;

public class Exam2 {
    public static void main(String[] args) {
        System.out.println(args.length);

        if(args.length == 0){
            System.out.println("사용법::  ");
            System.exit(0); //return; 으로 변경 가능
        }

        for (String str:args){
            System.out.println(str);
        }
    }
}
