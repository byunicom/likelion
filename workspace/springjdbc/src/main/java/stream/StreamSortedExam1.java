package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedExam1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana","Apple","Cherry","Date");
        List<String> sortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> reverseSortedFruits = fruits.stream()
                .sorted(Comparator.reverseOrder())  //내림차순
                .collect(Collectors.toList());

        System.out.println(sortedFruits);
        System.out.println(reverseSortedFruits);

        //--------------------------
        int[] iarr = {3,7,2,78,24,9,77,23};
        //위 배열을 오름차순으로 정렬해서 출력하세요.
        Arrays.stream(iarr)
                .sorted()   //IntStream에서 기본형 int 만 지원..
                .forEach(System.out::println);

        Arrays.stream(iarr)
                .boxed()    //Integer 로 박싱처리를 먼저 해야한다. (배열은 int 형인데 Comparator 는 int 형을 지원하지 않기 때문)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

}
