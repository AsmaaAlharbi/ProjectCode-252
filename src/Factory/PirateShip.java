/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import MainCode.ProjectCode252;

/**
 *
 * @author asmaabdullah
 */
public class PirateShip implements Event {

    private  final int PirateShip_Price = 15;

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
