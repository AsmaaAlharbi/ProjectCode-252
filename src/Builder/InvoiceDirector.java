/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author asmaabdullah
 */
public class InvoiceDirector {

    private InvoiceBuilder builder;

    public InvoiceDirector(InvoiceBuilder builder) {
        this.builder = builder;
    }

    public void constructInvoice(String userName, String[][] items) {

        builder.BuildUserName(userName);
        
        /* 
        add name of the events, num of tickets chosen by user (quantity), Total price of each event
        
         {"Bumper cars", Integer.toString(BQua), Integer.toString(BQua * BPrice)}
         {"Pirate Ship", Integer.toString(PQua), Integer.toString(PQua * PPrice)}
         {"Ice skating", Integer.toString(SQua), Integer.toString(SQua * SPrice)}
         {"Giant Wheel", Integer.toString(GQua), Integer.toString(GQua * GPrice)}
         {"Drop tower", Integer.toString(DQua), Integer.toString(DQua * DPrice)}
        
         */
        for (String[] item : items) {
            builder.BuildItem(item[0], Integer.parseInt(item[1]), Double.parseDouble(item[2]));
        }

        builder.BuildTotal();
    }
}
