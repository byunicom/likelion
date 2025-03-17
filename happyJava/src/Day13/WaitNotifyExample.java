package Day13;

import java.util.Objects;

public class WaitNotifyExample {
    private  static final Object lock = new Object();
    private static boolean itemAvailable = false;

    static class Producer extends Thread {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("생산자가 아이템을 생산 중입니다.");
                itemAvailable=true;
                lock.notify();
                System.out.println("생산자가 알림을 보냈습니다.");
            }
        }
    }

    static class Consumer extends Thread {


        @Override
        public void run() {
            synchronized (lock) {
                while(!itemAvailable){
                    System.out.println("소비자가 아이템을 기다리고 있습니다.");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("소비자가 아이템을 소비했습니다.");
                itemAvailable=false;    //아이템 소비 후 상태 업데이트
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        consumer.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.start();
    }
}
