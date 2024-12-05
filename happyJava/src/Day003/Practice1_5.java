/**
 * 문제 5: 두 배열의 합집합 구하기
 * int 타입의 두 배열 array1과 array2가 주어졌을 때, 두 배열의 합집합을 구하여 새 배열에 저장하고,
 * 결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 중복된 요소가 없어야 합니다.
 * int[] array1 = {1, 3, 5, 7, 9};
 * int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
 */
package Day003;

import java.util.Arrays;

public class Practice1_5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        int totLength = array1.length+array2.length;
        int[] array3 = new int[totLength];

        //array1 과 array2 를 array3 에 누적담기 시작
        int finalIdx=0;
        for(int i=0;i<array1.length;i++){
            array3[i]=array1[i];
            finalIdx=i;
        }
        finalIdx++;
        for(int i=0;i<array2.length;i++){
            array3[finalIdx]=array2[i];
            finalIdx++;
        }
        //array1 과 array2 를 array3 에 누적담기 끝

        //array3 의 배열 값 중 중복값 제거하여 distArr 에 담기
        int[] distArr = Arrays.stream(array3).distinct().toArray();

        //중복제거 후 표기
        for(int i=0;i<distArr.length;i++){
            System.out.println(distArr[i]);
        }

    }
}
