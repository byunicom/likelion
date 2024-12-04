package Day003;

public class ItemForArray {
    //클래스의 가장 기본이 되는 구성요소
    //데이터(속성-Field)를 나타내는 필드
    //

    /**
     * [용어 Remind]
     * 접근권한자 : public, private, protected...
     */
    //전역변수 <- java 용어로 field
    private int price;      //가격
    private String name;    //이름

    //int i = 10;   -- 초기화
    //생성자 -- 객체를 초기화 하는 메소드.    객체가 생성될 때 딱 한 번 실행됨
    //접근제한자 메서드명(클래스명과 동일) (매개변수들..) { ... }  <- 리턴타입은 생성하지 않는다. (매개변수들...) <-- 지역변수 (field)
    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;
    }


    //메서드. getter
    //접근제한자 리턴타입 메소드명(매개변수들...){ ...  }
    //******** 리턴타입 - 요청자에게 돌려주고자 하는 데이터타입
    //public 커피 makeCoffee(커피콩, 물){ 커피콩을 간다.. 물을 끓인다... }
    //public 밥 makeRice(씻은쌀, 물){ ... }
    //이미 만들어져 있는 메소드를 사용하는 방법을 알자!! (새로 만드는 것도 중요하지만...)

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    //setter    void - 예약어. (돌려줄 값 없다.)

    public void setPrice(int price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

}
