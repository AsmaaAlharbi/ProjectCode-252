/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bridge;

/**
 *
 * @author asmaabdullah
 */


//Create a concrete class STLATicketImplementor
public class STLATicketImplementor implements TicketImplementor {

    @Override
    public String generateTicketDetails(String date) {
        String ticket = "";
        String dateNo = date.substring(0, 10);
        String day = date.substring(10);

        ticket += "\n\n\t\tSTLA WORLD\n";
        ticket += "------------------TICKET---------------------\n";
        ticket += "       Date: " + dateNo + "   | " + day;
        ticket += "\n\t     4:00pm - 11:30pm";
        ticket += "\n\t TICKET CODE: " + 543 + "-" + 876 + "-" + 001;
        ticket += "\n---------------------------------------------\n\n";
        return ticket;
    }
}
