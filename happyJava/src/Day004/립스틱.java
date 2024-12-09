package Day004;

import Day005.ClassA;

public class 립스틱 {
//    String 브랜드;
//    Sring 컬러;
//    int 양;
//
//    public void 뚜껑을열다(){
//
//    }
    public static void main(String[] args) {
        ClassA c = new ClassA();
        System.out.println(c.fieldB);   //public 이므로 가능하지만
        //System.out.println(c.fieldC);   //private 이므로 불가능하다.
    }
}
