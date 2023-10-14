/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *Defining a class named Kayak that implements the Sailable interface, indicating it provides implementatiosns for its methods
 * @author thiagogoncos
 */
public class Kayak implements Sailable {
    
    private boolean sailHoisted;
    //Declaring a private instance variable to store whether the sail is hoisted or not
    
    public Kayak() {//Constructor for the Kayak class
        sailHoisted = false;
    }

    @Override
    public void hoistSail() {//Implement this method defined in the Sailable interface
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {//Implement this method defined in the Sailable interface
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {//Implement this method defined in the Sailable interface
        return sailHoisted;
    }

    @Override
    public void landHo() {//Implement this method defined in the Sailable interface
    }
    
    
}
