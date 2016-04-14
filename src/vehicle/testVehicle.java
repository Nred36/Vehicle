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
public class testVehicle {

    public static Vehicle vehicle() {

        return (new Car());
    }

    public static void main(String[] args) {
        Vehicle v;
        
        v= vehicle();
        System.out.println();
    }
}
