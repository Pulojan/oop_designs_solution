/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.b;

/**
 *
 * @author Pulojan
 */
public class Shark extends Fish{
    
    public static final Size SIZE = Size.LARGE;
    public static final Colour COLOUR = Colour.GREY;
    
    
    public void eat(Fish fish){
        System.out.println("Eating " + fish.toString());
    }
}
