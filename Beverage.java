/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

abstract class Beverage {
    protected String name;
    protected int price;
    public Beverage(){
    }
    public  Beverage(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    protected void setPrice(int price){
        this.price = price;
    }
    protected int getPrice(){
        return price;
    }
    protected abstract void decoratePattern();
    
}