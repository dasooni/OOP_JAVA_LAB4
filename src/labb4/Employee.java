package labb4;

public abstract class Employee extends Object implements Comparable <Employee>{
	
	public static final int BYNAME = 0;
	public static final int BYSALARY = 1;
	public static final int BYTAXES = 2;
	
	protected String firstName;
	protected String secondName;
	protected int employeeNumber;
	protected double salary;
	protected static int sortCriterion = 0;
	
	public Employee (String fName, String sName, int eNumber, double inPay){
		firstName = fName;
		secondName = sName;
		employeeNumber = eNumber;
		salary = inPay;
	}

	public static void changeCriterion (int sort){
		if(sort == BYNAME || sort == BYSALARY || sort == BYTAXES) {
			sortCriterion = sort;
		} 
	//This class method allows you to change the criterion by which the employees are sorted.
	}
	
	public abstract double computeTaxes(); 
	
	
	public String getName(){
		return secondName;
	}
	public int getNumber(){
		return employeeNumber;
	
	}
	public double getSalary(){
		return salary;
		
	}
	public String toString(){
		if(sortCriterion == BYNAME){
			return String.format("%10s%12s%8s", firstName, secondName, employeeNumber);
		}
		else if (sortCriterion == BYSALARY){
			return String.format("%10s%12s%8s%14s", firstName, secondName, employeeNumber, salary);
		}
		else{
			return String.format("%10s%12s%8s%14s", firstName, secondName, employeeNumber, computeTaxes());
		}
	}

	
}
