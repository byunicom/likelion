package Day13;

public class ThreadInterruptExample {
    static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                for(int i=0;i<5;i++){
                    Thread.sleep(1000);
                    System.out.println("step :: "+(i+1));
                }
            } catch (InterruptedException e) {
                System.out.println("스레드가 중단되었습니다.");
                return;
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt();
    }
}
