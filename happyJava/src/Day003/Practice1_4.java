/**
 * 문제 4: 배열 요소의 이동
 * String 타입의 배열 words가 있을 때, 모든 요소를 한 칸씩 오른쪽으로 이동시키는 코드를 작성하세요. 마지막 요소는 배열의 첫 번째 요소로 이동해야 합니다.
 * String[] words = {"Java", "Python", "C", "JavaScript"};
 * 출력 예시: {"JavaScript", "Java", "Python", "C"}
 */
package Day003;

public class Practice1_4 {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C", "JavaScript"};

        int j=0;
        for(int i=0;i<words.length;i++){
            j=i+1;

            if(j==words.length){
                j= 0;
            }

            System.out.println(words[j]);
        }
    }
}
