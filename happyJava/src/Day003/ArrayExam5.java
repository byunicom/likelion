package Day003;

public class ArrayExam5 {
    public static void main(String[] args) {

        //foreach   for(변수:반복되는 자료구조)
        //숫자일 경우
        int[] iarr = {1,2,3,4,5,6,7,8};

        for(int num :iarr){
            System.out.println(num);
        }

        //문자일 경우
        String[] strArr = {"abe","test","hahaha","kang"};
        for(String str : strArr){
            System.out.println(str);
        }

        //이차원 배열의 경우
        //숫자일 때
        int[][] iarr2 = {{1,2,3},{4,5,6}};
        System.out.println("이차원 배열 숫자------------------");
        for(int[] arr: iarr2){
            for(int num:arr){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
