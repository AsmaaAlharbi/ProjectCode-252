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
public class AppleWalletDecorator extends TicketDecorator {
    public AppleWalletDecorator(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void invoice() {
        System.out.println("Your ticket has been added to Apple Wallet!");
    }
}