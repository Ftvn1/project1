package project1.models;

public class Factory {
    private String factoryName;
    private int factoryReceptionPhone;
    private String factoryAddress;
  
	// DEFAULT CONSTRUCTOR:
    public Factory() {}
    // THREE PARAMS CONSTRUCTOR (factoryName, factoryReceptionPhone, factoryAddress):
    public Factory(String factoryName, int factoryReceptionPhone, String factoryAddress) {
    this.factoryName = factoryName;
    this.factoryReceptionPhone = factoryReceptionPhone;
    this.factoryAddress = factoryAddress;
    }
    
    public String fullFactoryInformation(String factoryName){
    return ("Factory " + this.factoryName + ", registered at " + this.factoryAddress + ", reception phone is " + this.factoryReceptionPhone);
    }
    
}
