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
public class PirateShip extends Event {

    private final int PirateShip_Price = 15;

    public PirateShip() {

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
        GUI_Main.PQua += quantity;
        GUI_Main.P -= quantity;
    }

    @Override
    public int getPrice() {
        return PirateShip_Price;
    }

}
