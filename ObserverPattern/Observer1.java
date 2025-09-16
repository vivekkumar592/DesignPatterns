package org.example.ObserverPattern;

public class Observer1 implements Observer{
    private Integer id;
    public Observer1(int id)
    {
        this.id = id;
    }
    @Override
    public void dataChanged(Observable observable){
        System.out.println("value Changed for "+this.id);
        System.out.println("new Data" + observable.getData());
    }
}
