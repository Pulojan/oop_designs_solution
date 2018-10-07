/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_designs.part.e;

import java.util.HashMap;
import java.util.Map;
import oop_designs.part.a.Animal;
import oop_designs.part.a.Bird;
import oop_designs.part.a.Cat;
import oop_designs.part.a.Chicken;
import oop_designs.part.a.Dog;
import oop_designs.part.a.Duck;
import oop_designs.part.a.Flyable;
import oop_designs.part.a.Rooster;
import oop_designs.part.a.Sound;
import oop_designs.part.a.Swimmable;
import oop_designs.part.a.Walkable;
import oop_designs.part.b.ClownFish;
import oop_designs.part.b.Dolphins;
import oop_designs.part.b.Fish;

/**
 *
 * @author Pulojan
 */
public class CountingFeatured {
    
    public Map<String, Integer> getDetailsOfAnimalsBehaviour(Animal[] animals){
        
        Map<String,Integer> map = new HashMap<>();
        map.put("Fly", 0);
        map.put("Walk", 0);
        map.put("Sing", 0);
        map.put("Swim", 0);
        
        for(Animal a: animals){
            if(a instanceof Flyable){
                map.put("Fly", map.get("Fly") + 1);
            }
            if(a instanceof Walkable){
                map.put("Walk", map.get("Walk") + 1);
            }
            if(a instanceof Sound){
                map.put("Sing", map.get("Sing") + 1);
            }
            if(a instanceof Swimmable){
                map.put("Swim", map.get("Swim") + 1);
            }
            
        }
        
        return map;
    }
    
    public static void main(String[] args){
        Animal[] animals = {
            new Bird(),new Chicken(), new Cat(), new Dog(), new Duck(), 
            new Rooster(), new Fish(), new ClownFish()
        };
        CountingFeatured countingFeatured = new CountingFeatured();
        Map<String, Integer> details = countingFeatured.getDetailsOfAnimalsBehaviour(animals);
        
        System.out.println(details);
    }
    
}
