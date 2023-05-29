/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorater;

/**
 *
 * @author taifm
 */
// comp impl
public class BasicTicket implements Ticket {
    @Override
    public void invoice() {
        System.out.println("Your ticket has been generated.");
    }
}