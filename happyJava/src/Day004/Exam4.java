package Day004;

class Pen{
    private String name;

    public void write(String msg){
        System.out.println(msg);

    }
}

public class Exam4 {


    public static void main(String[] args) {
        //class Pen 은 단지 설계도, 틀
        //class를 이용해서 실체(진짜 펜) 을 만들어야 함.

        Pen p = new Pen();

        //p 레퍼런스 변수 int[] iarr  - iarr는 레퍼런스 변수

        int i=0;    //int를 담을 수 있는 변수 i 를 선언했고, int 값 0 을 넣어줌.
        //Pen p -- Pen 을 가르킬 수 있는 변수 p 를 선언.

        p.write("안녕!");
    }

}
