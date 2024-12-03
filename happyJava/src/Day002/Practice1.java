/**
 * 실습 문제 1: 온도 변환기
 * 사용자로부터 섭씨 온도를 입력받아 화씨 온도로 변환하는 프로그램을 작성하세요.
 * 변환 공식은 F = C * 9/5 + 32 입니다. 변환된 화씨 온도를 출력하세요.
 */
package Day002;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = 0;
        try {
            c = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("숫자를 입력하세요.");
        }

        int f = 0;
        f = c * (9/5) +32;

        System.out.println(f);
    }
}
