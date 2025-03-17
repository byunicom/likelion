package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LamdaExam1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple","Banana","Cherry");
        //람다식을 이용하여 리스트의 각 요소 출력
        names.forEach(name -> System.out.println(name));


        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Thread: "+i);
                }
            }
        }).start();

        List<Integer> numbers = Arrays.asList(5,2,3,1,4);
        //람다식을 사용하여 정렬 기준 정의
        Collections.sort(numbers, (Integer a, Integer b) -> {
            return a.compareTo(b);
        });

        // 정렬된 리스트 출력
        numbers.forEach(n-> System.out.println(n));
    }
}
