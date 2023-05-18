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
public class BumperCars implements Event {

    private  final int BumperCars_Price = 20;

    @Override
    public void updateQuantity(int quantity) {
        ProjectCode252.BQua += quantity;
        ProjectCode252.B -= quantity;
    }

    @Override
    public int getPrice() {
        return BumperCars_Price;
    }

}
