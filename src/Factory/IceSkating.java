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
public class IceSkating implements Event {

    private  final int IceSkating_Price = 30;

    @Override
    public void updateQuantity(int quantity) {
        ProjectCode252.SQua += quantity;
        ProjectCode252.S -= quantity;
    }

    @Override
    public int getPrice() {
        return IceSkating_Price;
    }

}

