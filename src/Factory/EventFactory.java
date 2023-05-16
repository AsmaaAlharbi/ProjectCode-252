/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author asmaabdullah
 */
public class EventFactory {

    public Event createEvent(String eventType) {
        switch (eventType) {
            case "B":
                return new BumperCars();
            case "P":
                return new PirateShip();
            case "D":
                return new DropTower();
            case "G":
                return new GiantWheel();
            case "S":
                return new IceSkating();
            default:
                return null;
        }
    }
}
