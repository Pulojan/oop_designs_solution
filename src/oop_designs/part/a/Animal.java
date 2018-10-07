/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.a;

/**
 *
 * @author Pulojan
 */
public abstract class Animal implements MakeSound{
    
    void walk(){
        System.out.println("I am walking");
    }
    
    @Override
    public abstract void sing();
    
}
