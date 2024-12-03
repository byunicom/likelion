/**
 * 실습 문제 2: 짝수와 홀수 판별기
 * 사용자로부터 정수 하나를 입력받아, 그 수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
 * if-else 문을 사용하여 구현하세요.
 */
package Day002;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        try {
            num = scanner.nextInt();

            if(num % 2 == 0){
                System.out.println("짝수");
            }else{
                System.out.println("홀수");
            }
        } catch (Exception e) {
            System.out.println("숫자를 입력하세요.");
        }
    }
}
