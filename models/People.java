package project1.models;

 public class People {
    private String surnameAndName;
    private int homePhone;
    private String factory;
    private String address;
    private int peopleQuantity;
//  private int workPhone; // Mr.Occam would be mind it
//  private enum Post {ENGENEER, DIRECTOR, SECRETARY, WORKER;}// same thing
//  private int innCode; - gtfo
//  address as the set of fields (city + street + building + apartment) - goes the same way

				// DEFAULT CONSTRUCTOR:
    public People () {
    	peopleQuantity++;
    }            	
    // FOUR PARAMS CONSTRUCTOR (surnameAndName, homePhone, factory, address):
    public People(String surnameAndName, int homePhone, String factory, String address) {
    	this.surnameAndName = surnameAndName;
    	this.homePhone = homePhone;
    	this.factory = factory;
    	this.address = address;
    	peopleQuantity++;
    }
    public String getName(){
    	return (this.surnameAndName);
    }
    public String toString(){
    	return ("Name = " + this.surnameAndName + ", address: " + this.address + ", working at " + this.factory + ", home phone is " + this.homePhone);
    }
    public int getPeopleQuantity(){
    	return (peopleQuantity);
    }
 }
/*    private void changeRate(double newRate) { // Rate updating
    	this.rate = newRate; }
    через войдовые методы присваивать,
    через ретурны выдавать инфу,
toString - to output information about employee
In the method main() create 3 objects of Employee type. 
Input information about them. 
Display the total hours of all workers to screen
*/