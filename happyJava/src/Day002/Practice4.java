/**
 * 실습 문제 4: 팩토리얼 계산기
 * 사용자로부터 정수 n을 입력받아, 1부터 n까지의 곱(팩토리얼)을 계산하는 프로그램을 작성하세요.
 * 예를 들어, 사용자가 5를 입력하면, 5! = 120을 출력하세요. for 또는 while 루프를 사용하여 구현하세요.
 */
package Day002;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int result=0;
        try{
            n=scanner.nextInt();

            for(int i=1;i<=n;i++){
                result=n*i;
            }
            System.out.println(n+"! = " + result);

        } catch (Exception e) {
            System.out.println("숫자를 입력하세요.");
        }
    }
}
