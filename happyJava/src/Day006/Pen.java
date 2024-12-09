package Day006;

public class Pen {
    private String name;
    private String color;
    private int price;

    public Pen(){}

    public Pen(String name){
        this.name = name;
    }

    public Pen(String color, int price){
        this.color=color;
        this.price=price;
    }

    public Pen(String name, String color, int price){
        this(name);
        this.color=color;
        this.price=price;
    }
}
