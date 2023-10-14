/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *Defining a class named Helicopter that implements the Flyable interface, indicating it provides implementations for its methods
 * @author thiagogoncos
 */
public class Helicopter implements Flyable {
    
    //Declaring private instance variables to store information about the helicopter's speed, direction, make, type and altitude
    private float speed;
    private float direction;
    private String make;
    private String type;
    private float altitude;
    
    //Constructor for the Helicopter class, taking make and type as parameters for example
    public Helicopter(String make, String type) {
        this.make = make;
        this.type = type;
        this.speed = 0;
        this.direction = 0;
        this.altitude = 0;
    }

    @Override
    public void changeAltitude(float change) { //Implementing this method defined in the Flayable interface 
        //It allows the helicopter to change its altitude by a specified amount
        this.altitude += change;
    }

    @Override
    public float getAltitude() {//Implementing this method defined in the Flayable interface
        return altitude;
    }

    @Override
    public void accelerate(float speed) {//Implementing this method defined in the Flayable interface
        this.speed += speed;
    }

    @Override
    public void brake() {//Implementing this method defined in the Flayable interface
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {//Implementing this method defined in the Flayable interface
        this.direction += angle;
    }

    @Override
    public float getDirection() {//Implementing this method defined in the Flayable interface
        return direction;
    }

    @Override
    public float getSpeed() {//Implementing this method defined in the Flayable interface
        return speed;
    }

    @Override
    public String getMake() {//Implementing this method defined in the Flayable interface
        return make;
    }

    @Override
    public String getType() {//Implementing this method defined in the Flayable interface
        return type;
    }
    
    
    
}
