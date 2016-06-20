/**
 * 
 * @author<h1> Assad Akram(Sp13-bse-008)</h1>
 *<p>This class contains the information of the person who has account in the bank.</p>
 */
public class Person {
String name;
int salary;
	Person(String name,int Salary){
	this.name=name;
	this.salary=Salary;
	}
/**
 * This function return the name of the person.	
 * @return name
 */
public String getName(){
		return name;
	}
	/**
	 * This method return the salary of the person.
	 * @return salary
	 */
public	int getsalary(){
		return salary;
	}
}
