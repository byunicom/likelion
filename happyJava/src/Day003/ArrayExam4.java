package Day003;

public class ArrayExam4 {
    public static void main(String[] args) {
//        ItemForArray[] itemArr;
//        itemArr = new ItemForArray[3];
//        위와 동일하게 한줄로 작성
        ItemForArray[] itemArr = new ItemForArray[3];

        ItemForArray item1 = new ItemForArray(3000,"연필");
        ItemForArray item2 = new ItemForArray(5000,"컵");
        ItemForArray item3 = new ItemForArray(10000,"공책");

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
