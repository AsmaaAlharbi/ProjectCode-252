/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcode.pkg252;

/**
 *
 * @author asmaabdullah
 */
public class EventsFactory {

    public Events GetGames(String type) {
        if (type.equalsIgnoreCase("IceSkating")) {
            return new IceSkating();
        }
        return null;

    }

}
