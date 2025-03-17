package Day13;

public class ThreadExam {
    public static void main(String[] args) {
        System.out.println("main Thread 출발");
        //쓰레드 생성
        MyThread myThread = new MyThread();
        myThread.start();
        CaramiThread caramiThread = new CaramiThread();
        caramiThread.start();
        //run 을 직접호출하지 않고
        // start() 라는 메서드가 실제 수행 흐름을 하나 만들어내는 일을 하고,
        // 준비가 되면 run() 호출한다.

        for(int i=0;i<100;i++){
            System.out.println("main 안녕"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("min Thread 종료!!");

    }
}
