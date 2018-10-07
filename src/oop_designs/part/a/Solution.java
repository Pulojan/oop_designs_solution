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
public class Solution {
    
    public static void main(String[] args){
        Bird bird = new Bird();
        
        Parrot p = new Parrot(new Dog());
        p.sing();
    }
    
}
