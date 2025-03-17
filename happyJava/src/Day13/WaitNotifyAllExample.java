package Day13;

public class WaitNotifyAllExample {
    private static final Object lock = new Object();
    private static int itemsAvailable = 0;

    static class Producer extends Thread {
        @Override
        public void run() {
            synchronized (lock){
                itemsAvailable +=5; //5개의 아이템 생산
                System.out.printf("생산자가" + itemsAvailable +"개의 아이템을 생산하였습니다.");
                lock.notifyAll();
                System.out.println("생산자가 모든 소비자에게 알림을 보냈습니다.");
            }
        }
    }

    static class Consumer extends Thread {
        private int id;

        Consumer(int id){
            this.id=id;
        }

        @Override
        public void run() {
            synchronized (lock){
                while(itemsAvailable<=0){
                    try {
                        System.out.println("소비자 "+id+"가 아이템을 기다리고 있습니다.");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    itemsAvailable--;
                    System.out.println("소비자 "+id+"가 아이템으 ㄹ소비했습닏. 남은 아이템: "+itemsAvailable);
                }
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer1 = new Consumer(1);
        Consumer consumer2 = new Consumer(2);
        Consumer consumer3 = new Consumer(3);

        consumer1.start();
        consumer2.start();
        consumer3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.start();
    }
}

