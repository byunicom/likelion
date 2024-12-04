/**
 * 문제 4: for-each 문을 사용한 배열 요소 출력
 * int 타입의 배열 numbers가 다음과 같이 초기화되어 있습니다.
 * int[] numbers = {5, 10, 15, 20, 25};
 * for-each 문을 사용하여 배열 numbers의 모든 요소를 출력하는 코드를 작성하세요.
 */
package Day003;

public class Practice4 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        for(int arr:numbers){
            System.out.println(arr);
        }
    }
}
