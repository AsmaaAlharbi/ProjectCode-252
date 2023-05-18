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
        builder.setUserName(userName);
        for (String[] item : items) {
            builder.addItem(item[0], Integer.parseInt(item[1]), Double.parseDouble(item[2]));
        }
        builder.calculateTotal();
    }
}
