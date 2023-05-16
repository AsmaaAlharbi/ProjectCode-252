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

public class DropTower implements Event {

    private static final int DropTower_Price = 25;

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
