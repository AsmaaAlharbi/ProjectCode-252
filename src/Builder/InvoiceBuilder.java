/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

/**
 *
 * @author asmaabdullah
 */
public class InvoiceBuilder implements Builder {

    private Invoice invoice;
    private StringBuilder items;
    private double subtotal;

    public InvoiceBuilder() {
        invoice = new Invoice();
        items = new StringBuilder();
        subtotal = 0;
    }

    @Override
    public void BuildUserName(String userName) {
        invoice.setUserName(userName);
    }

    @Override
    public void BuildItem(String itemName, int quantity, double itemTotal) {

        // check if quantity(num of tickets chosen by user) is zero or not 
        // because we will add to the invoice only the events that the user selected 
        
        if (quantity != 0) {
            items.append("\n" + itemName + "          " + quantity + "                 " + itemTotal);
            subtotal += itemTotal;
        }
    }

    @Override
    public void BuildTotal() {
        double tax = subtotal * 0.15;
        double total = subtotal + tax;

        invoice.setItems(items.toString());
        invoice.setSubtotal(subtotal);
        invoice.setTax(tax);
        invoice.setTotal(total);
    }

    @Override
    public Invoice getInvoice() {
        return invoice;
    }
}
