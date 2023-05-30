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
public class GiantWheel extends Event {

    private final int GiantWheel_Price = 30;

    public GiantWheel() {

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
        GUI_Main.GQua += quantity;
        GUI_Main.G -= quantity;
    }

    @Override
    public int getPrice() {
        return GiantWheel_Price;
    }

}
