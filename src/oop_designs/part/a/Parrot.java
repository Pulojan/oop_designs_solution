/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.a;

public class Parrot extends Bird{
    private final Sound livingWith;
    
    public Parrot(Sound livingWith){
        this.livingWith = livingWith;
    }
    
    @Override
    public void sing(){
        livingWith.sing();
    }
}
