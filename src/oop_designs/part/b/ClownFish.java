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
public class ClownFish extends Fish{
    
    public static final Size SIZE = Size.SMALL;
    public static final Colour COLOUR = Colour.ORANGE;
    
    public void makeJokes(){
        System.out.println("Making jokes...");
    }
    
}
