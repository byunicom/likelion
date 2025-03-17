package com.example.builderExam;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("medium",false, true, false);

        System.out.println(pizza);

        Pizza pizza2 = Pizza.builder()
                .size("Small")
                .build();
        System.out.println(pizza2);
    }
}
