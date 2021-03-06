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
public class Bus extends Vehicle {

    public Bus(String d, String v) {
        super(d, v);
    }

    public int maxSpeed() {
        return (80);
    }

    int distance() {
        return (1000000);
    }

    double cost() {
        return (300);
    }

    double toSixty() {
        return (1000);
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
