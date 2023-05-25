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
public class TicketDecorator implements Ticket {
    protected Ticket ticket;

    public TicketDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void invoice() {
        ticket.invoice();
    }
}
