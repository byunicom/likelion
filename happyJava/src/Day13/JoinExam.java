package Day13;

class SumThread extends Thread{
//    public SumThread(){
//
//    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("계산종료!!");
    }
}

public class JoinExam {
    public static void main(String[] args) {
        System.out.println("main이 일을 시작합니다.");
        System.out.println("복잡한 계산을 해야하는 일을 만났습니다.");

        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("SumThread에서 계산을 끝냈습니다. 결과는...입니다.");
    }
}
