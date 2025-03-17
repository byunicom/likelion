package lamda;

public class LamdaVariableAccess {
    public static void main(String[] args) {
        int num = 10;

        Runnable r = () -> System.out.println("외부 변수 num의 값은: " + num);

        //람다식 실행
        new Thread(r).start();
    }
}
