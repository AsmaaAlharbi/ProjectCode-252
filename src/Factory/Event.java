package Factory;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asmaabdullah
 */
import Bridge.Day;

public abstract class Event {

    protected Day day;

    public abstract void getDay();

    public abstract int getPrice();

    public abstract void updateQuantity(int quantity);

    abstract public void chosenDay(Day day);
}
