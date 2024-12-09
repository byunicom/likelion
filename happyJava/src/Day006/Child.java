package Day006;

public class Child extends Parent{
    int i=10;

    @Override
    public int getI() {
        return i;
    }

    public void print(){
        System.out.println(i);
    }
}
