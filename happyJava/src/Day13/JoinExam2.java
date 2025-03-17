package Day13;
class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String taskName){
        this.taskName=taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName+"작업시작");

        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(taskName+"작업종료!!");
    }
}

class DeamonThread extends Thread{
    @Override
    public void run() {
        //백그라운드 배경음악
        while(true){
            System.out.println("배경음악 재생중!!");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class JoinExam2 {
    public static void main(String[] args) {
        TaskThread task1 = new TaskThread("작업 1");
        TaskThread task2 = new TaskThread("작업 2");

        DeamonThread deamonThread = new DeamonThread();

        task1.start();
        task2.start();
        
        deamonThread.setDaemon(true);
        deamonThread.start();

        try {
            System.out.println("모든 작업의 완료를 기다립니다.");
            task1.join();
            task2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("모든작업이 완료되었습니다.");
    }
}
