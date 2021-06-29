/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

class Coffee1 extends Beverage{
    public Coffee1(String name){
        super(name);
        setPrice(100);
    }
    public void decoratePattern(){
        System.out.println("Cost of : "+ name +" : "+ price);
    }
}