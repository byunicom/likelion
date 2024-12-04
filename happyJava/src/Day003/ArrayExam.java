package Day003;

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

    }
}
