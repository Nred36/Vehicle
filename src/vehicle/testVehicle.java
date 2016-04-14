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
        

        return (new Car(sc.nextLine(),sc.nextLine()));
    }

    public static void main(String[] args) {
        Vehicle v;

        v = vehicle();
        System.out.println(v);
    }
}
