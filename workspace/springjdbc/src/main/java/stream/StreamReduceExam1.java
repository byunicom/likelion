package stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
6. 데이터 축소: 리듀싱 연산
6.1. 리듀싱 연산의 개념
리듀싱 연산이란?
리듀싱 연산은 스트림 내의 여러 데이터를 특정 기준에 따라 하나의 결과로 결합하는 과
정입니다. 이 과정은 스트림 내 요소들을 순차적 혹은 병렬적으로 처리하여, 하나의 결론
을 도출하는 데 사용됩니다.
TECHIT BACK-END SCHOOL 10 53
리듀싱 연산의 중요성
리듀싱 연산은 데이터의 복잡성을 단순화하고, 큰 데이터 집합에서 의미 있는 결과를 도
출하는 데 필수적입니다. 이를 통해 데이터를 요약, 분석하고 의사 결정을 지원하는 데 도
움이 됩니다.
TECHIT BACK-END SCHOOL 10 54
리듀싱 연산의 활용
집계: 총합, 평균, 최대값, 최소값 등을 계산할 때 사용됩니다.
데이터 변환: 여러 값을 하나로 결합하여 새로운 결과를 생성할 때 활용됩니다.
정보 추출: 대규모 데이터 집합에서 필요한 정보를 추출하는 데 사용됩니다.
TECHIT BACK-END SCHOOL 10 55
리듀싱 연산의 특징
결합성: 연산이 결합 법칙을 만족해야 병렬 처리에 적합합니다.
상태 없음: 각 요소의 처리가 다른 요소들에 의존하지 않아야 합니다.
결과의 단일성: 모든 입력 요소들이 하나의 결과로 수렴합니다.
*/
public class StreamReduceExam1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0,(a,b)->a+b);

        System.out.println(sum);
    }
}
