package Day13;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        System.out.println("안녕!!");
        Scanner scanner = new Scanner(System.in);
        String msg= scanner.next();
        //수행흐름이 하나인 경우 (단일 스레드)
        System.out.println("입력한 메시지는 "+msg+" 입니다.");
    }
}
