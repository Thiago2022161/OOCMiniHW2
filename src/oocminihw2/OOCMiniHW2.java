/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

import java.util.Scanner;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating an instance of a SportsCar with the make and type below
        SportsCar car1 = new SportsCar("Nissan", "Skyline");
        car1.accelerate(100); //accelerate the Sports car to a speed of 100 units
        car1.turn(45); //Turn the sports car by 45 degrees
        car1.brake(); //Apply the brakes to stop the Sports car
        
        //Creating an instance of a Helicopter with the make and type below
        Helicopter helicopter1 = new Helicopter("Sikorsky", "UH-60 Black Hawk");
        helicopter1.accelerate(300);//accelerate the Helicopter to a speed of 100 units
        helicopter1.turn(30);//Turn the Helicopter by 30 degrees
        helicopter1.changeAltitude(500); //change the Altitude by 500 units
        
        //Creating an instance of a Kayak
        Kayak kayak1 = new Kayak();
        kayak1.hoistSail(); //Hoist the sail of the Kayak
        
        //Creating an instance of a car with the make, type and number of passengers below
        Car normalCar = new Car("Renault", "Clio", 4);
        
    }
    
}
