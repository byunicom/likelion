/**
* 책 한권의 정보를 담기 위한 클래스
*
* @author  byunicom
* @since 2024.12.2
* @version 0.1
*
* */

package Day001;

public class Book {
    /*
        title
        price 를 필드로 선언하였습니다.
    */

//    필드의 값을 수정하고 얻기 위한 메소드를 만든다.
//    setter, getter - 프로퍼티(property) - price 프로퍼티
    private String title;
    private  int price;

    public int getPrice(){
        return this.price * 2;  // this는 내 자신 인스턴스를 참조하는 예약어.
    }

    public  void  setPrice(int price){  //지역변수 price
        this.price = price;
    }

    /*
    * 책의 제목을 반환한다.
    * @return 책의 제목
    * */
    public String getName(){
        return title;
    }

    public void setName(String title){
        this.title = title;
    }
}
