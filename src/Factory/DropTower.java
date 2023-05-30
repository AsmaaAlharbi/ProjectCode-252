/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Bridge.Day;
import MainGUI.GUI_Main;

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
        GUI_Main.DQua += quantity;
        GUI_Main.Da -= quantity;
    }

    @Override
    public int getPrice() {
        return DropTower_Price;
    }

}
