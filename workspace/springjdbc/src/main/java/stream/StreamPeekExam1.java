package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
4.2. 스트림 요소 순회하기: forEach , peek
스트림 요소 순회의 중요성
스트림 요소를 순회하는 것은 스트림을 활용하여 데이터를 처리하는 데 있어 기본적이
면서도 중요한 작업입니다. 순회를 통해 각 요소에 대한 연산을 실행하고, 데이터를 조작
하거나, 결과를 출력할 수 있습니다.

forEach 메소드의 기능
기능 설명: forEach 메소드는 스트림의 각 요소에 대해 주어진 작업을 수행합니다.
사용 상황: forEach 는 최종 연산으로, 스트림의 모든 요소에 대해 주어진 작업을 실
행하고 스트림 처리를 종료합니다.
예시: 데이터 출력, 요소에 대한 조작 등에 사용됩니다.

peek 메소드의 기능
기능 설명: peek 메소드는 스트림의 각 요소에 대해 작업을 수행하지만, 스트림 자
체는 변화시키지 않습니다.
사용 상황: peek 는 중간 연산으로, 디버깅이나 요소에 대한 임시 처리(예: 로깅)를
위해 사용됩니다.
차이점: forEach 와 달리 peek 는 스트림의 흐름을 중단하지 않습니다.

스트림 순회의 활용
스트림 순회는 데이터를 조작하고 결과를 확인하는 과정에서 매우 유용합니다. 특히,
peek 는 스트림의 중간 상태를 확인하면서 디버깅하는 데 도움이 됩니다.

*/
public class StreamPeekExam1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //forEach 사용 예시
        numbers.stream()
                .forEach(n-> System.out.println("Number: "+n));

        //peek 사용 예시
        List<Integer> doubledNumbers = numbers.stream()
                .peek(n-> System.out.println("Processing 1: "+n))
                .map(n->n*2)
                .peek(n-> System.out.println("Processing 2: "+n))
                .collect(Collectors.toList());
    }
}
