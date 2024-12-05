/**
 * 문제 6: 이차원 배열에서의 대각선 요소 합계
 * int 타입의 이차원 배열 matrix가 주어졌을 때, 두 대각선의 요소 합계를 구하는 코드를 작성하세요. 배열은 정사각형 배열이라고 가정합니다.
 * int[][] matrix = {
 *     {1, 2, 3},
 *     {4, 5, 6},
 *     {7, 8, 9}
 * };
 * 대각선 요소의 합계를 각각 구하고, 그 결과를 출력하세요.
 */
package Day003;

public class Practice1_6 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int sum=0;

        //정방향
        for(int i=0;i<matrix.length;i++){
            //정방향
            for(int j=0;j<matrix[i].length;j++){
                if(i==j) {
                    System.out.print(matrix[i][j]);
                    sum=sum+matrix[i][j];
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("정방향 합계 : "+sum);
        System.out.println();

        sum=0;
        for(int i=0;i<matrix.length;i++){
            //정방향
            int idx=0;
            for(int j=matrix[i].length-1;j>=0;j--){
                if(i==idx) {
                    System.out.print(matrix[i][j]);
                    sum=sum+matrix[i][j];
                    System.out.println();
                }
                idx=idx+1;
            }
        }
        System.out.println();
        System.out.println("역방향 합계 : "+sum);
        System.out.println();

    }
}
