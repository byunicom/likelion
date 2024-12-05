/**
 * 문제 5: 두 배열의 합집합 구하기
 * int 타입의 두 배열 array1과 array2가 주어졌을 때, 두 배열의 합집합을 구하여 새 배열에 저장하고,
 * 결과 배열을 출력하는 코드를 작성하세요. 합집합 배열에는 중복된 요소가 없어야 합니다.
 * int[] array1 = {1, 3, 5, 7, 9};
 * int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};
 */
package Day003;

public class Practice1_5 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {0, 2, 4, 6, 8, 10, 3, 5};

        int totLength = array1.length+array2.length;
        int totIdx = 0;
        int[] array3 = new int[totLength];

        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array1.length;j++){
                if(array2[i]==array1[j]){
                    totIdx += totIdx;
                    array3 = new int[totIdx];

                    System.out.println(array2[i]);
                }
            }
        }
//        int endIdx=0;
//        for(int i=0;i<array1.length;i++){
//            array3[i]=array1[i];
//            endIdx=i;
//        }
//
//        endIdx++;
//
//        for(int i=0;i<array2.length;i++){
//
//            array3[endIdx]=array2[i];
//
//            endIdx++;
//        }
//        for(int i=0;i<array3.length;i++){
//            System.out.println(array3[i]);
//        }


    }
}
