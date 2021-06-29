/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage){
        super(beverage);
    }
    public void decoratePattern(){
        super.decoratePattern();
        decorateSugar();        
    }
    public void decorateSugar(){
        System.out.println("Added Sugar to : "+beverage.getName());
    }
    public int getIncrementPrice(){
        return 15;
    }
    public String getDecoratedName(){
        return "Sugar";
    }
}