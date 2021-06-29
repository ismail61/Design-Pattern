/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;


public class DecoratorMain {
     public static void main(String args[]){
        Beverage beverage = new Sugar(new Milk(new Coffee1("CafeMocha")));
        beverage.decoratePattern();
        System.out.println("");
        beverage = new Sugar(new Milk(new Coffee2("Cappuccino")));
        beverage.decoratePattern();
        System.out.println("");
        beverage = new Milk(new Coffee3("Affogato"));
        beverage.decoratePattern();
    }
}
