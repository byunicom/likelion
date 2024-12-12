package Day003.ItemForArray;

class ItemForArray2 {

    private int price;      //가격
    private String name;    //이름

    public ItemForArray2(int price, String name){
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

public class ArrayExam4 {
    public static void main(String[] args) {
//        ItemForArray[] itemArr;
//        itemArr = new ItemForArray[3];
//        위와 동일하게 한줄로 작성
        ItemForArray2[] itemArr = new ItemForArray2[3];

        ItemForArray2 item1 = new ItemForArray2(3000,"연필");
        ItemForArray2 item2 = new ItemForArray2(5000,"컵");
        ItemForArray2 item3 = new ItemForArray2(10000,"공책");

        itemArr[0] = item1;
        itemArr[1] = item2;
        itemArr[2] = item3;

        int sum=0;
        for(int i=0;i< itemArr.length;i++){
            System.out.println("이름 : "+ itemArr[i].getName()+"\t금액 : "+itemArr[i].getPrice());
            sum=sum+itemArr[i].getPrice();
        }
        System.out.println("총 금액 : "+ sum);

    }
}
