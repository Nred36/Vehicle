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
public class Car extends Vehicle {

    public Car(String d, String v) {
        super(d, v);
    }

    public int maxSpeed() {
        return (123);
    }

    int distance() {
        return (123);
    }

    double cost() {
        return (123);
    }

    double toSixty() {
        return (123);
    }

    public String toString() {
        return (super.getDriver() + " drives " + getVehicle() + ".");
    }
}
