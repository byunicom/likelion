package Day009;

public class ExceptionExam03 {
    public static void methodA() throws RuntimeException{
        //예외가 발생할 때 이메서드를 호출한 쪽에 예외처리를 맡기는 경우 - unchecked Exception
    }

    public static void methodB() throws Exception{
        //예외가 발생할 때 이메서드를 호출한 쪽에 예외처리를 맡기는 경우 - checked Exception
    }

    public static  void methodC(){
        //예외가 발생했지만, 매서드 내에서 처리한 경우
        try{

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        //methodA 는 main 에서 체크하지 않고 methodA 를 호출하므로 unchecked 상태이다.
        methodA();

        //methodB 는 main 에서 체크하고 methodB를 호출하므로 checked 상태이다.
        try{
            methodB();
        } catch (Exception e) {
            System.out.println(e);
        }

        methodC();
    }
}
