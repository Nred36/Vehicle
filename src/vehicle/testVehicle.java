/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Scanner;

/**
 *
 * @author naree1878
 */
public class testVehicle {

    public static Vehicle vehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name");
        String name = sc.nextLine();
        System.out.println("Input a vehicle you would like to buy(minivan, truck, bus or car)");
        String vehicle = sc.nextLine();
        if (vehicle.equalsIgnoreCase("minivan") || vehicle.equalsIgnoreCase("m")) {
            return (new MiniVan(name, "minivan"));
        } else if (vehicle.equalsIgnoreCase("truck") || vehicle.equalsIgnoreCase("t")) {
            return (new Truck(name, "truck"));
        } else if (vehicle.equalsIgnoreCase("bus") || vehicle.equalsIgnoreCase("b")) {
            return (new Bus(name, "bus"));
        } else {
            return (new Car(name, "car"));
        }

    }

    public static void main(String[] args) {
        Vehicle v;

        v = vehicle();
        System.out.println(v+"\nIt goes from 0 to 60km/h in "+v.toSixty() + "s, has a max speed of " + v.maxSpeed() + "km/h and can go" + v.distance() + "km without refueling\nWould you like to buy this vehicle?");
        
    }
}
