package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExam1 {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Apple","Banana"),
                Arrays.asList("Cherry","Date")
        );

        System.out.println(nestedList);

        //기능:
        //flatMap 메소드는 각 요소를 스트림으로 변환하고, 그 스트림들을 하나의
        //스트림으로 합칩니다. 이는 중첩된 구조를 평탄화하는 데 사용됩니다.

        //사용 방법:
        // flatMap 은 중첩된 스트림 구조를 단일 스트림으로 통합할 때 사용됩니다.
        // 이 메소드는 Function 인터페이스를 인자로 받으며, 이 함수는 각 요소를 스트림으로 변환합니다.
        List<String> flatList = nestedList.stream() //스트림 생성
                .flatMap(Collection::stream)    //리스트를 평탄화
                .collect(Collectors.toList());  //결과 수집

        System.out.println(flatList);
    }
}
