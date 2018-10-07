/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.d;

import oop_designs.part.a.Flyable;

/**
 *
 * @author Pulojan
 */
public class Butterfly extends CaterPillar implements Flyable{

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
    
}
