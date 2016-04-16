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
public class Truck extends Vehicle {

    public Truck(String d, String v) {
        super(d, v);
    }

    public int maxSpeed() {
        return (200);
    }

    int distance() {
        return (7000);
    }

    double cost() {
        return (35000);
    }

    double toSixty() {
        return (12);
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
