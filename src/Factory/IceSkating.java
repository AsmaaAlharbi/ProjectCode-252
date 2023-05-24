/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Bridge.Day;
import MainCode.ProjectCode252;

/**
 *
 * @author asmaabdullah
 */
public class IceSkating extends Event {

    private final int IceSkating_Price = 30;

    public IceSkating() {

    }

    @Override
    public void chosenDay(Day day) {
        this.day = day;
    }

    @Override
    public void getDay() {
        day.chosenDay();
    }

    @Override
    public void updateQuantity(int quantity) {
        ProjectCode252.SQua += quantity;
        ProjectCode252.S -= quantity;
    }

    @Override
    public int getPrice() {
        return IceSkating_Price;
    }

}
