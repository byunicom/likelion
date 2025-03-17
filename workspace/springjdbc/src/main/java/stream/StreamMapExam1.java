package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMapExam1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Apple", "Cherry", "Date");

        //map 메소드는 스트림의 각 요소를 주어진 함수에 따라 다른 형태로 변환합니다.
        //map 은 Function 인터페이스를 인자로 받습니다. 이 함수는 각 요소를 다른 형태로 매핑하는 역할을 합니다.

        //각 요소를 소문자로 바꿔서 출력해주세요.
        words.stream()
                .map(word->word.toLowerCase())
                .forEach(System.out::println);

        int[] intArr = {2,4,5,7,33,55,77};

        //각 요소에 3을 더해서 출력해주세요.
        Arrays.stream(intArr)
                .map(number->number+3)
                .forEach(System.out::println);

        int[] resultArr = Arrays.stream(intArr)
                .map(n->n+3)
                .toArray();

        System.out.println(Arrays.toString(resultArr));

    }
}
