/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

class Coffee2 extends Beverage{
    public Coffee2(String name){
        super(name);
        setPrice(120);
    }
    public void decoratePattern(){
        System.out.println("Cost of : "+ name +" : "+ price);
    }    
}