/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

class Milk extends BeverageDecorator{
    public Milk(Beverage beverage){
        super(beverage);
    }
    public void decoratePattern(){
        super.decoratePattern();
        decorateLemon();    
    }
    public void decorateLemon(){
        System.out.println("Added Milk to : "+beverage.getName());        
    }
    public int getIncrementPrice(){
        return 20;
    }
    public String getDecoratedName(){
        return "Milk";
    }
}