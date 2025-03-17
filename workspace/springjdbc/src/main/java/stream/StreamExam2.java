package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple","Banana","Cherry","Apple","Cherry","Date");

        //글자수가 5개 이상인 것만 필터링 하고 중복은 제거하고 새로운 리스트를 얻고 싶어요.
        //스트림 사용하지 않고, 위에 제시된 문제를 풀어보세요.
        List<String> result = new ArrayList<>();

        for(String word:words){
            if(word.length()>=5){
                if(result.contains(word)) continue; {
                    result.add(word);
                }
            }

        }
        System.out.println(result);

        List<String> result2 = words.stream()
                .filter(w-> w.length()>=5)  //필터링
                .distinct() //중복제거
                .collect(Collectors.toList());  //새로운 리스트 반환
        System.out.println(result2);
        result2.add("kang");
        System.out.println(result2);

        List<String> result3 = words.stream()
                .filter(w-> w.length()>=5)  //필터링
                .distinct() //중복제거
                .toList();  //불변리스트 리턴
//        result3.add("test");    //오류 발생

        System.out.println(result3);
    }
}
