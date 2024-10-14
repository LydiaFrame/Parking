/*
 * Program: Parking.java
 * Student: Lydia Frame 
 * Purpose:
*/

import java.util.Scanner; // Import the Scanner class

public class Parking {
		

        public static void main(String[] args) {

            //Garage object. 
            Garage garage = new Garage();

            //Create two objects of the Car class
            Car car1 = new Car("BMW");
            Car car2 = new Car("Tesla"); 

            //call park method
            garage.park(car1); 
            garage.park(car2); 
		
    }
}