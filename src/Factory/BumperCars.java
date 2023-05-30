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
public class BumperCars extends Event {

    private final int BumperCars_Price = 20;

    public BumperCars() {

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
        GUI_Main.BQua += quantity;
        GUI_Main.B -= quantity;
    }

    @Override
    public int getPrice() {
        return BumperCars_Price;
    }

}
