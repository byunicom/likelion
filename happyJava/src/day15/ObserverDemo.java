package day15;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String message);
}

interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservser(Observer observer);
}

class YouTubeChannel implements Subject{
    private String channelName;
    private List<Observer> observers;

    public YouTubeChannel(String channelName){
        this.channelName=channelName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservser(Observer observer) {
        for(Observer observer : observers){
            System.out.println();
            observer.update(channelName);
        }
    }
}

public class ObserverDemo {
    public static void main(String[] args) {

    }
}
