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
public class Duck extends Bird implements Swimmable,Flyable{
   @Override
   public void sing(){
       System.out.println("Quack, Cluck");
   }

    @Override
    public void swim() {
        System.out.println("I am swimming...");
    }

    @Override
    public void fly() {
        System.out.println("I am flying...");
    }
}
