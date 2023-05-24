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
        ProjectCode252.PQua += quantity;
        ProjectCode252.P -= quantity;
    }

    @Override
    public int getPrice() {
        return PirateShip_Price;
    }

}
