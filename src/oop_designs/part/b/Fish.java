/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.b;

import oop_designs.part.a.Animal;
import oop_designs.part.a.Swimmable;

/**
 *
 * @author Pulojan
 */
public class Fish extends Animal implements Swimmable{
    
    @Override
    public void swim(){
        System.out.println("I am swimming");
    }
    
}
