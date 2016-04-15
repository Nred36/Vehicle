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
public class MiniVan extends Vehicle {

    public MiniVan(String d, String v) {
        super(d, v);
    }

    public int maxSpeed() {
        return (220);
    }

    int distance() {
        return (50000);
    }

    double cost() {
        return (15000);
    }

    double toSixty() {
        return (8);
    }

    public String toString() {
        return (super.getDriver() + " could drive a " + getVehicle() + " for only "+ cost()+"$.");
    }
    public String equals(){
        return ("gg");
    }
}
