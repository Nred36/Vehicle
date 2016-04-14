/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author naree1878
 */
abstract public class Vehicle {

    /**
     * @param args the command line arguments
     */
    public String getDriver() {
        return ("f");
    }

    public String getVehicle() {
        return ("f");
    }

    abstract int maxSpeed();
}
