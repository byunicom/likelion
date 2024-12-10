package Concept;

public class Structure {
    int i;
    String str;

    public static void main(String[] args) {
        Structure structure = new Structure();
        structure.write();

        Structure st2 = new Structure("a");
        Structure st3 = new Structure(10);

    }
    public Structure(){}

    //생성자
    public Structure(String str){
        System.out.println(str);
    }

    //생성자
    public Structure(int i){
        System.out.println(i);
    }

    //메소드
    public static void write(){
        System.out.println("글쓰기");
    }
}