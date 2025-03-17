package Day13;

public class MyRunnable implements Runnable {
    String name;

    public MyRunnable(String name){
        this.name=name;
    }
    // 이 클래스 자체가 쓰레드는 아님.
    @Override
    public void run() {
        //이 쓰레드가 할일을 구현함
        System.out.println(name+"MyThread 출발");

        for(int i = 0;i<10;i++){
            System.out.println(name+"MyThread 안녕!!"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(name+"MyThread 종료!!");
    }
}
