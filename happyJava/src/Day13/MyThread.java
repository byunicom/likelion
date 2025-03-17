package Day13;

public class MyThread extends Thread{
    @Override
    public void run() {
        //이 쓰레드가 할일을 구현함
        System.out.println("MyThread 출발");

        for(int i = 0;i<100;i++){
            System.out.println("MyThread 안녕!!"+i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("MyThread 종료!!");
    }
}
