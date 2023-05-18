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
public class GiantWheel implements Event {

    private  final int GiantWheel_Price = 30;

    @Override
    public void updateQuantity(int quantity) {
        ProjectCode252.GQua += quantity;
        ProjectCode252.G -= quantity;
    }

    @Override
    public int getPrice() {
        return GiantWheel_Price;
    }

}
