package stream;

import java.util.Arrays;
import java.util.List;

/*
5.2. 집계 연산: count , max , min , average , sum
집계 연산의 중요성
집계 연산은 스트림에서 특정 기준에 따라 데이터를 요약하고 분석하는 데 사용됩니다.
이를 통해 대규모 데이터 셋에서 유용한 정보를 추출하고 데이터의 특성을 파악할 수 있
습니다.

count 메소드의 기능
기능 설명: count 는 스트림 내 요소의 개수를 반환합니다.
사용 상황: 데이터의 총 개수가 필요할 때 사용됩니다.
예시: 데이터 셋 내 특정 조건을 만족하는 요소의 수를 세는 데 사용됩니다.

max 와 min 메소드의 기능
기능 설명: max 는 스트림 내 최대 값을, min 은 최소 값을 찾습니다.
사용 상황: 데이터 중 가장 크거나 작은 값을 찾을 때 사용됩니다.
예시: 최고 점수 또는 최저 점수를 찾는 데 사용됩니다.

average 메소드의 기능
기능 설명: average 는 스트림 내 요소들의 평균 값을 계산합니다.
사용 상황: 데이터의 평균적인 특성을 파악할 때 사용됩니다.
예시: 평균 점수나 평균 가격을 계산하는 데 사용됩니다.

sum 메소드의 기능
기능 설명: sum 은 스트림 내 요소들의 합을 계산합니다.
사용 상황: 데이터의 총합이 필요할 때 사용됩니다.
예시: 총 매출액이나 총 점수를 계산하는 데 사용됩니다

집계 연산의 활용
집계 연산은 데이터의 크기, 범위, 평균, 총합 등을 파악하는 데 필수적입니다. 이를 통해
데이터 분석, 보고서 생성, 의사결정 지원 등 다양한 분야에서 중요한 역할을 수행합니다.
집계 연산은 스트림 API를 사용하여 간결하고 효율적인 방식으로 데이터를 처리할 수 있
게 해줍니다

*/
public class StreamCountExam1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,22,33,55,77,99);

        long count = numbers.stream().count();  //요소 개수
        int max = numbers.stream().max(Integer::compareTo).orElse(0);   //최대 값, List가 비어있으면 0 반환
        int min = numbers.stream().min(Integer::compareTo).orElse(0);   //최소 값
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);    //평균 값
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();   //총합

        System.out.println(count);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
        System.out.println(sum);

    }
}
