package stream;

import java.util.Arrays;
import java.util.List;

/*
5. 매칭, 검색, 집계 연산
5.1. 조건 매칭: allMatch , anyMatch , noneMatch
조건 매칭의 중요성
스트림에서 조건 매칭은 주어진 조건에 맞는 요소가 있는지 확인하는 데 사용됩니다. 이
를 통해 데이터 집합이 특정 조건을 만족하는지 효과적으로 검증할 수 있습니다.

allMatch 메소드의 기능
기능 설명: allMatch 는 스트림의 모든 요소가 주어진 조건을 만족하는지 검사합니
다.
사용 상황: 데이터 전체가 특정 조건을 충족해야 할 때 사용됩니다.
예시: 모든 요소가 양수인지 확인하는 경우에 사용됩니다.

anyMatch 메소드의 기능
기능 설명: anyMatch 는 스트림의 어떤 요소라도 주어진 조건을 만족하는지 검사합
니다.
사용 상황: 하나 이상의 요소가 조건을 충족하는지 확인할 때 사용됩니다.
예시: 적어도 하나의 요소가 특정 값을 가지는지 확인하는 경우에 사용됩니다.

noneMatch 메소드의 기능
기능 설명: noneMatch 는 스트림의 모든 요소가 주어진 조건을 만족하지 않는지 검
사합니다.
사용 상황: 어떤 요소도 특정 조건을 충족하지 않아야 할 때 사용됩니다.
예시: 모든 요소가 특정 범위 밖에 있는지 확인하는 경우에 사용됩니다.

조건 매칭의 활용
조건 매칭은 데이터 검증, 조건에 따른 로직 분기, 데이터 세트의 특성 파악 등 다양한 상
황에서 유용합니다. 특히, allMatch , anyMatch , noneMatch 는 복잡한 조건을 간결하게
표현할 수 있어 코드의 가독성을 높여줍니다.

*/
public class StreamMatchingExam1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        boolean allPositive = numbers.stream().allMatch(n -> n>0);      //모든 숫자가 양수인지
        boolean anyNegative = numbers.stream().anyMatch(n -> n<0);      //어떤 숫자라도 음수인지
        boolean noneAboveTen = numbers.stream().noneMatch(n -> n>10);   //모든 숫자가 10 이하인지

        System.out.println(allPositive);
        System.out.println(anyNegative);
        System.out.println(noneAboveTen);
    }
}
