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

    static String name;

    public static Vehicle vehicle() {
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your name");
        name = sc.nextLine();
        boolean run = true;
        while (run) {
            Vehicle v = vehicle();
            System.out.println(v + "\nIt goes from 0 to 60km/h in " + v.toSixty() + "s, has a max speed of " + v.maxSpeed() + "km/h and can go" + v.distance() + "km without refueling\nWould you like to buy this vehicle?");
            if (sc.nextLine().toLowerCase().startsWith("n")) {
                System.out.println("Would you like to look at another?");
                if (sc.nextLine().toLowerCase().startsWith("n")) {
                    run = false;
                }
            } else {
                System.out.println("Congratulations you now own a " + v.getVehicle());
                System.out.println("Would you like to look at another?");
                if (sc.nextLine().toLowerCase().startsWith("n")) {
                    run = false;
                }
            }
        }
        System.out.println("");
    }
}
