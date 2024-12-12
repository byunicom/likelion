package Day009;

import java.util.Scanner;

public class ExceptionExam06 {
    //사용자 정의 예외!!
    public static  void  inputScroe(int score) throws MyException{
        //사용자가 예외상황을 직접 정의하고, 예외를 발생시키고 있다.
        if(score < 0 || score >100) {
            throw new MyException("점수는 0-100까지만 유효합니다.");
        }

        System.out.println("학생의 점수 :::    "+score);

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");

        try {
            inputScroe(keyboard.nextInt());
        } catch (MyException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}
