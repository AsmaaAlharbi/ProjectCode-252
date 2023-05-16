/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Bridge;

/**
 *
 * @author asmaabdullah
 */

//Create an abstract class Ticket
public abstract class Ticket {

    protected TicketImplementor ticketImplementor;

    public Ticket(TicketImplementor ticketImplementor) {
        this.ticketImplementor = ticketImplementor;
    }

    public abstract String generateTicket(String date);
}
