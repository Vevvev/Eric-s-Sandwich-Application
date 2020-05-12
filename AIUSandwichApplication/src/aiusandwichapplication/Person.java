/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiusandwichapplication;

/**
 *
 * @author ericb
 */
public abstract class Person {
      //abstract class person. 
    protected String name; 
    //protected allows this string to be public, but only the class its extended to can change it.
    protected String address;
    protected String city;
    protected String state;
    protected String zip;
	
    public Person(String name,String address,String city,String state,String zip){
	this.name=name; 
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
    }
}
