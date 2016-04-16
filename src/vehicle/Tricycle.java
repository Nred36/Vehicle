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
public class Tricycle extends Vehicle {

    public Tricycle(String d, String v) {
        super(d, v);
    }

    public int maxSpeed() {
        return (180000);
    }

    int distance() {
        return (1);
    }

    double cost() {
        return (0);
    }

    double toSixty() {
        return (.00000001);
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
