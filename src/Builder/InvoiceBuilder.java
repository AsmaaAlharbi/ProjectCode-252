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
    public void setUserName(String userName) {
        invoice.setUserName(userName);
    }

    @Override
    public void addItem(String itemName, int quantity, double itemTotal) {

        if (quantity != 0) {
            items.append("\n" + itemName + "          " + quantity + "                 " + itemTotal);
            subtotal += itemTotal;
        }
    }

    @Override
    public void calculateTotal() {
        double tax = subtotal * 0.15;
        double total = subtotal + tax;

        invoice.setItems(items.toString());
        invoice.setSubtotal(subtotal);
        invoice.setTax(tax);
        invoice.setTotal(total);
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
