package org.example.ObserverPattern;
import java.util.ArrayList;
public interface Observable {
    Integer temperature =0;
    ArrayList<Observer> activeObservers = new ArrayList<>();
    public void add(Observer observer);
    public void remove(Observer observer);
    public void setData(int temp);
    public void notifyAllObservers();
    public int getData();
}
