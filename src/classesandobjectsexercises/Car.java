/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjectsexercises;

/**
 *
 * @author lee_g
 */
public class Car {
    
    String make;
    String model;
    int numWheels;
    String colour;
     
    
    public void drive (double direction ){
        
        System.out.println(String.format("The %s %s is driving at %d degrees",colour, make, direction));
    }
}
