/** The program of Andrii S.
 * dd. 2018/10/01
*/
package project1;
import java.util.Scanner;
// import java.util.*;
import java.util.ArrayList;
import project1.models.People;
import project1.models.Factory;

public class Main {
	public static void main(String[] args){
	
		int exitChecker = 1;
		int commandReader = 0;
		int peopleCounter = 0;
		int factoryCounter = 0;
		
//* FILLING DATABASE OF PEOPLE*/
	ArrayList<People> peopleList = new ArrayList();
	People emp1 = new People("Bul'ba Taras", 7654321, "Fabrica # 1", "Dnipro, av.1, b.1, ap.1");
	People emp2 = new People("Bul'ba Ostap", 7654320, "Fabrica # 2", "Dnipro, av.2, b.2, ap.2");
	People emp3 = new People("Bul'ba Andrii", 7654322, "Office # 1", "Dnipro, av.3, b.3, ap.3");
	People emp4 = new People("Bryl's'ka Barbara", 7654323, "Fabrica # 2", "Dnipro, av.4, b.4, ap.4");
	People emp5 = new People("Did Panas", 7654324, "Fabrica # 1", "Dnipro, av.5, b.5, ap.5");
	peopleList.add (emp1);
	peopleList.add (emp2);
	peopleList.add (emp3);
	peopleList.add (emp4);
	peopleList.add (emp5);
	peopleCounter = peopleList.size();
	
//* FILLING DATABASE OF FACTORIES*/		
	ArrayList<Factory> factoryList = new ArrayList();
	Factory fact1 = new Factory ("Fabrica # 1", 1234567, "Dnipro, 1st street, 1");
	Factory fact2 = new Factory ("Fabrica # 2", 1234566, "Dnipro, 2nd street, 2");
	Factory fact3 = new Factory ("Office # 1", 1234565, "Dnipro, 3rd street, 3");
	factoryList.add (fact1);
	factoryList.add (fact2);
	factoryList.add (fact3);
	factoryCounter = factoryList.size();

	
	do {
		System.out.println("Hello, my friend!");
		System.out.println("What information would you like to get?");
		System.out.println("About factory (1) or a worker (2)? Or press 0 to exit");
		Scanner scan = new Scanner(System.in);
		commandReader = scan.nextInt();
		exitChecker = commandReader;
		if (commandReader == 1) {
			System.out.println("Please choose the factory:");
			System.out.println("Factory1 - 1, Factory2 - 2, Office1 - 3. Or press 0 to exit");
			Scanner scan2 = new Scanner(System.in);
			int commandReader2 = scan2.nextInt();
			if (exitChecker > 0){
				exitChecker = commandReader2;
			}
			if (commandReader2 == 1) {
			System.out.println (Factory.fullFactoryInformation(fact1));
			}
			else { if (commandReader2 == 2) {
			System.out.println (Factory.fullFactoryInformation(fact2);
			}
			else {if (commandReader == 3) {
			System.out.println (Factory.fullFactoryInformation(fact3);
			}
			}
		}
	  } else if (commandReader == 2) {
		    System.out.println("Please choose your fighter:");
			System.out.println("Bul'ba Taras - 1, Bul'ba Ostap - 2, Bul'ba Andrii - 3, Bryl's'ka Barbara - 4, Did Panas - 5. Or press 0 to exit");
			Scanner scan3 = new Scanner(System.in);
			int commandReader3 = scan3.nextInt();
			if (exitChecker > 0){
				exitChecker = commandReader3;
			}
			if (commandReader3 == 1) {
				System.out.println (People.foolPeopleInfo("Bul'ba Taras"));
				}
				else { if (commandReader3 == 2) {
					System.out.println (People.foolPeopleInfo("Bul'ba Ostap"));
					}
					else { if (commandReader3 == 3) {
						System.out.println (People.foolPeopleInfo("Bul'ba Andrii"));
						}
						else { if (commandReader3 == 4) {
							System.out.println (People.foolPeopleInfo("Bryl's'ka Barbara"));
							}
							else { if (commandReader3 == 5) {
								System.out.println (People.foolPeopleInfo("Did Panas"));
								}
					}
					}
					}
				}
	  }
		System.out.println("If you need another information - press 1, or press 0 to exit");
		Scanner scan4 = new Scanner(System.in);
		int commandReader4 = scan4.nextInt();
		if (exitChecker > 0){
			exitChecker = commandReader4;
		}
	} while (exitChecker != 0);
  }
}