/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *Defining a class named SportsCar that implements the Drivable interface, indicating it provides implementations for its methods 
 * @author thiagogoncos
 */
public class SportsCar implements Drivable {
    
    //Declaring private instance variables to store information about the sports car's speed, direction, make and type 
    private float speed;
    private float direction;
    private String make;
    private String type;
    
    //Constructor for the SportsCar class, taking make and type as parameters for example
    public SportsCar(String make, String type) {
        this.make = make;
        this.type = type;
        this.speed = 0;
        this.direction = 0;
    }

    @Override
    public void accelerate(float speed) {//Implement this methode defined in the Drivable interface 
        this.speed += speed;
    }

    @Override
    public void brake() {//Implement this methode defined in the Drivable interface 
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {//Implement this methode defined in the Drivable interface 
        this.direction += angle;
    }

    @Override
    public float getDirection() {//Implement this methode defined in the Drivable interface 
        return direction;
    }

    @Override
    public float getSpeed() {//Implement this methode defined in the Drivable interface 
        return speed;
    }

    @Override
    public String getMake() {//Implement this methode defined in the Drivable interface 
        return make;
    }

    @Override
    public String getType() {//Implement this methode defined in the Drivable interface 
        return type;
    }
    
    
    
}
