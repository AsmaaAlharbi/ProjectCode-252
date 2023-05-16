/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author asmaabdullah
 */

//Create a concrete class STLATicket
public class STLATicket extends Ticket {

    public STLATicket(TicketImplementor ticketImplementor) {
        super(ticketImplementor);
    }

    @Override
    public String generateTicket(String date) {
        return ticketImplementor.generateTicketDetails(date);
    }
}
