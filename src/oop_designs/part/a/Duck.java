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
public class Duck extends Bird{
    @Override
    public void sing(){
        System.out.println("Quack, Quack");
    }
    
    public void swim(){
        System.out.println("I am swimming");
    }
}
