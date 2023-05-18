/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author asmaabdullah
 */
public class Invoice {

    private String userName;
    private String items;
    private double subtotal;
    private double tax;
    private double total;
    private String date;

    public Invoice() {
        this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\n\n****************** INVOICE ********************"
                + "\nDate: " + date
                + "\nBill to: " + userName + "\n"
                + "\nItem              Quantity          Item Total"
                + items
                + "\n\nSubtotal: " + total
                + "\nTax: " + tax
                + "\nTotal Price: " + total
                + "\n***********************************************";

    }
}
