package Day002;

//if 는 모든 조건을 스캔하는데, switch 는 조건에 부합할 경우까지만 스캔한다.
//속도가 조금 빠르다고는 하지만 크게 속도 차이를 느낄 수는 없다.

public class SwitchExam {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1 :
                System.out.println("1 입니다.");
                break;
            case 2 :
                System.out.println("2 입니다.");
                break;
            case 3 :
                System.out.println("3 입니다.");
                break;
            default :
                System.out.println("1, 2, 3 이 아닙니다.");
        }
    }
}
