/**
 * 문제 2: 최대값과 최소값 찾기
 * double 타입의 배열 doubles에서 최대값과 최소값을 찾아 출력하는 코드를 작성하세요.
 * double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};
 */
package Day003;

import java.util.Arrays;

public class Practice1_2 {
    public static void main(String[] args) {
        double[] doubles = {1.5, 3.7, 2.4, 9.8, 7.6, 3.4};

        double max = doubles[0];
        double min = doubles[0];

        for(int i = 0;i<doubles.length;i++){

            if(max < doubles[i]){
                max = doubles[i];
            }

            if(min > doubles[i]){
                min = doubles[i];
            }
        }
        System.out.println("최대값 : "+ max);
        System.out.println("최소값 : "+ min);
    }
}
