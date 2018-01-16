/***************************
Project: Modification of FBI Project
Programmer: Martina Tawedrous
Date: May 8 2016
Program Name: MT_Suspect.Java
Description: Creates and modifies the FBI class definition
 ****************************/
package MT_useSuspect;

public class MT_Suspect 

{

	//Declare variables
	String name;
	String add;
	String state;
	char sex;
	String car;
	int sal;
	int sav;
	int age;
	int year;
	
	
	//First constructor
	public MT_Suspect (String name, String add, String state, int age, char sex, int sal, int sav, String car, int year) {
		
		this.name = name;
		this.add = add;
		this.state = state;
		this.sex = sex;
		this.car = car;
		this.sal = sal;
		this.sav = sav;
		this.age = age;
		this.year = year;
	}
	
	//second constructor
	public MT_Suspect() 
	
	{
	
	}

	
	
	// method to access characteristics where it sets and stores values to specified variables
	public void setName (String factor) {	
		this.name = factor;		
	}
	
	public void setAdd (String factor) {	
		this.add = factor;	
	}
	
	public void setState (String factor) {
		this.state = factor;	
	}

	public void setSex (char factor) {
		this.sex = factor;
	}
	
	public void setCar (String factor) {
		this.car = factor;	
	}
	
	public void setSal (int factor) {
		this.sal = factor;
	}
	
	public void setSav (int factor) {
		this.sav= factor;
	}
	
	public void setAge (int factor) {
		this.age = factor;
	}
	
	public void setYear (int factor) {
		this.year = factor;
	}
	
	
	
	// reads in and returns values from specified variables
	public String getName () {
		return this.name;
	}
	
	public String getAdd () {
		return this.add;
	}
	
	public String getState () {
		return this.state;
	}
	
	public char getSex () {
		return this.sex;
	}
	
	public String getCar () {
		return this.car;
	}
	
	public int getSal () {
		return this.sal;
	}
	
	public int getSav () {
		return this.sav;
	}
	
	public int getAge () {
		return this.age;
	}

	public int getYear() {
		return this.year;
	}
	
	
	//method to display info 
	public String toString () 
	
	{
		
		String data1;
		
		data1 = name + " , " + add + " , " + state + " ,  " + sex + " ,  " + car + " ,  " + sal + " , " + sav + " , " + age + " , " + year;
		
		return data1;
	}

}
