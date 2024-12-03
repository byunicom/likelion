package Day002;

//if 는 모든 조건을 스캔하는데, switch 는 조건에 부합할 경우까지만 스캔한다.
//속도가 조금 빠르다고는 하지만 크게 속도 차이를 느낄 수는 없다.

public class SwitchExam {
    public static void main(String[] args) {
        int num = 99;
        String Str = "";
        switch (num){
            case 100 :
            case 99 :
            case 98 :
            case 97 :
            case 96 :
            case 95 :
                Str = "A";
                break;
            case 94 :
            case 93 :
            case 92 :
            case 91 :
            case 90 :
                Str = "B";
                break;
            case 89 :
            case 88 :
            case 87 :
            case 86 :
            case 85 :
                Str = "C";
                break;
            case 84 :
            case 83 :
            case 82 :
            case 81 :
            case 80 :
                Str = "D";
                break;
            default:
                Str = "F";
        }
        System.out.println("학점은 "+Str+" 이고, 원점수는 "+num+" 입니다.");

    }
}
