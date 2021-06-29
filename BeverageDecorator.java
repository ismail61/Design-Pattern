/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage;
    public BeverageDecorator(Beverage beverage){    
        this.beverage = beverage;    
        setName(beverage.getName()+" + "+getDecoratedName());
        setPrice(beverage.getPrice()+getIncrementPrice());
    }
    public void decoratePattern(){
        beverage.decoratePattern();
        System.out.println("Cost of : "+getName()+" : "+getPrice());
    }    
    public abstract int getIncrementPrice();
    public abstract String getDecoratedName();
} 