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

    String driver, vehicle;
    /**
     * @param args the command line arguments
     */
    public Vehicle(String name,String v) {
        driver = name;
        vehicle = v;
    }
    public String getDriver() {
        return (driver);
    }

    public String getVehicle() {
        return (vehicle);
    }

    abstract int maxSpeed();

    abstract int distance();

    abstract double cost();

    abstract double toSixty();
}
