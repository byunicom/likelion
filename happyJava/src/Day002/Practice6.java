/**
 * 실습 문제 6: 양의 정수의 합 구하기
 * 사용자로부터 양의 정수들을 계속 입력받되, 사용자가 0을 입력하면 입력을 중단하고
 * 그때까지 입력받은 양의 정수들의 총합을 출력하는 프로그램을 작성하세요.
 * do-while 루프를 사용하여 구현하세요.
 */
package Day002;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int result = 0;
        do{
            num = scanner.nextInt();
            result = result + num;
        }while(num != 0);

        System.out.println("입력한 값의 합은 " + result + "입니다.");

    }
}