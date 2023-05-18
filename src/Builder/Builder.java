/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

/**
 *
 * @author asmaabdullah
 */
interface Builder {

    void setUserName(String userName);

    void addItem(String itemName, int quantity, double itemTotal);

    void calculateTotal();
}
