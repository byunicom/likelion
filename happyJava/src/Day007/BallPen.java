package Day007;

//생성자는 생성자에서만 호출할 수 있다.

public class BallPen extends Pen {
    //부모가 가진 메소드, 필드를 자식이 똑같이 다시 정의 하는 것!! 오버라이드이다.
    @Override
    public void write(){
        //super.write();
        System.out.println("볼펜이 씁니다.");
    }

    public void print(){
//        System.out.println("a");
//        System.out.println("b");
//        System.out.println("c");
//        System.out.println("d");
        super.print();
        System.out.println("e");
    }

    public static void main(String[] args) {
        BallPen ballPen = new BallPen();
        ballPen.write();
        System.out.println("-------------");
        Pen b = new BallPen();
        b.write();
//        Pen b1 = new BallPen();
        //ballPen.print();

    }
}
