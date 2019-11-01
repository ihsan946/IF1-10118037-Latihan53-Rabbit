/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program Rabbit
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal animal = new Animal(false, "grass", 4);
       Rabbit rabbit = new Rabbit("Peter", animal.isVegetarian(), animal.getEats(), animal.getNoOfLegs(), "grey");
       System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor() );
        
    }
    
}
