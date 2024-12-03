package Day002;

public class WhileExam3 {
    public static void main(String[] args) {
        int i = 0;
        while(++i < 11){
            if(i % 2 != 0) continue;    //짝수는 출력하지 않겠다!!!
            System.out.println(i);
        }
    }
}
