package com.example.sample.bean;

public class Player {
    private String name;
    private Dice dice;  //실행될 때 주사위를 주입받아야 함(의존성 주입 DI)

    public Player(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public void play(){
        System.out.println(name+"은 주사위를 던져서 "+dice.getNumber()+"가 나왔습니다.");
    }
}
