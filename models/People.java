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
    public String foolPeopleInfo(String surnameAndName){
    	return ("Name = " + this.surnameAndName + ", address: " + this.address + ", working at " + this.factory + ", home phone is " + this.homePhone);
    }
 }