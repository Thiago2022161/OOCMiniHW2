/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 * Defining a class named Car that extends the Vehicle class, inheriting its properties and methods 
 * @author thiagogoncos
 */
public class Car extends Vehicle { 
    //Constructor for the Car class that takes 3 parameters: Make, type and number of Passangers
    public Car (String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numWheels = 4;
        this.numPassengers = numPassengers;
    }
    
}
