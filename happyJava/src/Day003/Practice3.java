/**
 * 문제 3: 배열의 길이 구하기
 * String 타입의 배열 words가 다음과 같이 초기화되어 있습니다.
 * String[] words = {"Hello", "World", "Java", "Programming"};
 * 배열 words의 길이를 출력하는 코드를 작성하세요.
 */
package Day003;

public class Practice3 {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java", "Programming"};
        int size=0;
        for(int i=0;i<words.length;i++){
            size = words[i].length();
            System.out.println(size);
        }

    }
}
