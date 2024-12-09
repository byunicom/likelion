package Day006;

//상속에서 생각해 볼 부분!!
//부모가 가진 것을 자식이 똑같이 다시 정의 할 수 있어요!! <-- 오버라이팅 이라고 한다. (Overriding ... 올라타다)
//class Parent{
//    int i = 5;
//
//    public int getI(){
//        return i;
//    }
//}
//class Child extends Parent{
//    int i =10;
//}

public class Exam02 {


    public static void main(String[] args) {
//        Child child = new Child();
//        System.out.println("자식 i 값 : "+child.i);
//
//        Parent parent = new Parent();
//        System.out.println("부모 i 값 : "+parent.i);

//        Parent p = null;
//        Child c = null;
//
//        p = new Child();      //묵시적 형변환이 일어남.
//        c=new Parent();     //자식은 부모를 가리킬(담을) 수 없다.

        //c = p;      //실제로는 p가 가리키고 있는 인스컨스가 Child 라는 사실을 알고 있다.
//        c = (Child)p;     //실제로는 p가 가리키고 있는 인스턴스가 Child 이므로 명시적 형변환이 가능하다.

        //!!!!!!!!!!명시적 형변환 주의사항  -- 부모를 자식으로 바꿀 수는 없으므로, 주의해야 한다.
        Parent p1 = null;
        Child c1 = null;

//        p1 = new Parent();
//        c1 = (Child)p;  //이렇게 하면 오류 발생. (부모를 자식으로 바꿀 수(형변환) 없기 때문)

        //p의 타입이 Child 이면...
//        if(p instanceof Child){
//            //이 조건문 안에서는 p 의 instance 가 Parent 이면 수행하지 않으므로, 이렇게 감싸주면 좋다.
//        }

//        //부모(조상)는 자식(자손)을 가리킬(담을 ) 수 있다.
//        Car c = new Car();          //가능
//        Car c2 = new Bus();         //가능
//        Car c3 = new Truck();       //가능
//
//        Truck t = new Truck();      //가능
////        Truck t2 = new Bus();       //불가능
////        Truck t3 = new Car();       //불가능



    }
}
