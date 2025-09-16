package org.example.ObserverPattern;

import java.util.ArrayList;

public class WeatherObservable implements Observable{
    private Integer temperature;
    ArrayList<Observer> activeObservers = new ArrayList<Observer>();
    @Override
    public void add(Observer observer)
    {
        activeObservers.add(observer);
    }

    @Override
    public void remove(Observer observer)
    {
        activeObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers(){
        for(Observer obs : activeObservers)
        {
            obs.dataChanged(this);
        }
    }

    @Override
    public void setData(int temp){
        this.temperature = temp;
        notifyAllObservers();
    }

    @Override
    public int getData(){
        return this.temperature;
    }

}
