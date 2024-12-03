package Day002;

public class IfExam3 {
    public static void main(String[] args) {
        int i = 0;

        if(i % 2 == 0){
            System.out.println("짝수 입니다.");
        }else{
            System.out.println("홀수 입니다.");
        }

        //삼항연산자
        //(조건)? 값1:값2
        int num = 10;

        boolean b = (num % 2 == 0)?true:false;
        System.out.println(b);
        System.out.println("------------------");

        String s = (num % 2 == 0)?"짝수":"홀수";
        System.out.println(s);
    }
}
