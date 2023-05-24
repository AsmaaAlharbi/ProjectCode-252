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
public class DropTower extends Event {

    private final int DropTower_Price = 25;

    public DropTower() {

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
        ProjectCode252.DQua += quantity;
        ProjectCode252.Da -= quantity;
    }

    @Override
    public int getPrice() {
        return DropTower_Price;
    }

}
