/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

abstract class TicketBookingProcessTemplate {
    
    public abstract void selectEvent();

    public abstract void makePayment();

    public abstract void confirmBooking();

    public abstract void generateQR();

    public final void bookTicket() {
        selectEvent();
        makePayment();
        confirmBooking();
        generateQR();
    }
}

//------------------------------------------------------------------------------
class STLAWorldTicketSelection extends TicketBookingProcessTemplate {
    @Override
    public void selectEvent() {
        System.out.println("Select the event you want to book tickets for");
        // Implementation to select the event in STLA World
    }

    @Override
    public void makePayment() {
        System.out.println("Make payment for the selected event tickets");
        // Implementation for making payment in STLA World
    }

    @Override
    public void confirmBooking() {
        System.out.println("Confirm the booking of the event tickets");
        // Implementation to confirm the booking in STLA World
    }

    @Override
    public void generateQR() {
        System.out.println("Generate QR code for the booked tickets");
        // Implementation to generate QR code in STLA World
    }
}
//------------------------------------------------------------------------------

class TemplateMethodPatternClient {
    public static void main(String[] args) {
        TicketBookingProcessTemplate ticketBookingProcess = new STLAWorldTicketSelection();
        ticketBookingProcess.bookTicket();
    }
}