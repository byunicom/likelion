package Day002;

public class IfExam2 {
    public static void main(String[] args) {
        int i = 15;

        if(i>8 && i<=12){
            System.out.println("아침 먹었니?");
        }else if(i>12 && i<=17){
            System.out.println("점심 먹었니?");
        }else if(i>17 && i<=21){
            System.out.println("점심 먹었니?");
        }else{
            System.out.println("야식 먹었니?");
        }
    }
}
