/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.a;

/**
 *
 * @author Pulojan
 * @param <T>
 */
public class Parrot<T extends MakeSound> extends Bird{
    private final T livingWith;
    
    public Parrot(T livingWith){
        this.livingWith = livingWith;
    }
    
    @Override
    public void sing(){
        livingWith.sing();
    }
}
