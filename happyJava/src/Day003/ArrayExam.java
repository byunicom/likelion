package Day003;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ArrayExam {
    public static void main(String[] args) {
        int score1 = 0;
        int score2 = 5;
        int score3 = 10;
        int score4 = 15;

        int sum = score1 + score2 + score3 + score4;
        System.out.println("합계 : "+sum);
        //배열
        //배열을 선언, 사용
        //변수선언.. 타입 변수명
        //타입[] 배열명; --배열의 선언

        int idx=2;
        int size;

        //배열 선언
        int[] iarr;

        //배열 생성
        iarr = new int[]{score1, score2, score3, score4};

        size=iarr.length;
        System.out.println("첫번째 index 는 0 부터 시작합니다.");
        System.out.println("배열의 총 수량은 "+size+" 이고, "+"선택한 배열 index 는 "+idx+" 이며, 배열의 값은 "+iarr[idx]+" 이다.");

        int[] lotto = new int[55];

        for(int j =0; j<lotto.length;j++){
            lotto[j] = j+1;
        }

        System.out.println(lotto[40]);

        int sum2 = 0;

        for(int i = 0; i<lotto.length;i++){
            sum2=sum2+lotto[i];
        }

        System.out.println("lotto 합 : " + sum2);

        System.out.println("lotto 평균 : " + (sum2 / lotto.length));

        String[] str;

        str = new String[3];
        str[0] = "hello";
        str[1] = "hi";
        str[2] = "hoho";

        int[] iarr5 = {4,2,67,3};   //생성과 동시에 초기화. (처음 생성시만 가능)

        String[] sarry = {"a","b","c"};


        for(int i =0; i<sarry.length;i++){
            System.out.println(sarry[i]);
        }

        int[] arry7 = new int[5];
        for(int i = 0;i<arry7.length;i++){
            System.out.println(arry7[i]);
        }
    }
}
