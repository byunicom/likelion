package Day009;

public class ExceptionExam05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        try{
            System.out.println("Try start");

            int i= arr[2]/1;

            System.out.println(arr[2]);
            System.out.println("try end!!!");

        }catch (IndexOutOfBoundsException e){
            System.out.println(e);

        }finally {
            System.out.println("반드시 실행되는 블럭!!");
        }

        System.out.println("다음 할일 1");
        System.out.println("다음 할일 2");
        System.out.println("다음 할일 3");
        System.out.println("끝!");
    }
}
