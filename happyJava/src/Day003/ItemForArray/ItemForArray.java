package Day003.ItemForArray;

public class ItemForArray {

    private int price;      //가격
    private String name;    //이름

    public ItemForArray(int price, String name){
        this.price = price;
        this.name = name;
    }


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
