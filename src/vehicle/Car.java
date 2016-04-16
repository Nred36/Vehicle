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
        return (250);
    }

    int distance() {
        return (10000);
    }

    double cost() {
        return (10000);
    }

    double toSixty() {
        return (7);
    }

    public String toString() {
        return (super.getDriver() + " could drive a " + getVehicle() + " for only " + cost()+"$.");
    }

    public boolean equals(Vehicle v) {
        if (v.cost() > cost()) {
            return (true);
        } else {
            return (false);
        }
    }
}
