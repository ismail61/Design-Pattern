/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

class Coffee3 extends Beverage{
    public Coffee3(String name){
        super(name);
        setPrice(150);
    }
    public void decoratePattern(){
        System.out.println("Cost of : "+ name +" : "+ price);
    }
}