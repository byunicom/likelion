/**
 * 문제 1: 기본형 배열 선언과 초기화
 * int 타입의 배열 numbers를 선언하고, 크기가 10인 배열로 초기화하세요.
 * 배열의 모든 요소를 0부터 9까지의 숫자로 초기화하는 코드를 작성하세요.
 */
package Day003;

public class Practice1 {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        for(int i =0; i<10;i++) {
            System.out.println(numbers[i]);
        }
    }
}
