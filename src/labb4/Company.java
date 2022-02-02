package labb4;
import java.util.ArrayList;
import java.util.Collections;

public class Company extends Object{
	
	private ArrayList<Employee> theEmployee;  // Array ska läsa både workers och directors

	public Company (){
		theEmployee = new ArrayList <Employee>();
	}
	
	void addEmployee(Director arg){
		theEmployee.add(arg);
	}
	void addEmployee(Worker arg1, Director arg2){
		//This instance method adds a worker to the dynamic array of employees and attaches it to one director.
		 theEmployee.add(arg1);
		 arg2.addEmployee(arg1);
		
		
	}

	public String toString(){
		Collections.sort(theEmployee);
		
		String result = "List of Employees\n------------------\n";
		
		if (Employee.sortCriterion == Employee.BYNAME ){
			result += String.format("%10s%12s%12s",  "First Name", "Surname", "Number\n");
		}
		else if (Employee.sortCriterion == Employee.BYSALARY ){
			result += String.format("%10s%12s%11s%11s",  "First Name", "Surname", "Number", "Salary\n");
		}
		else{
			result += String.format("%10s%12s%11s%10s",  "First Name", "Surname", "Number", "Taxes\n");
		}
		for(int i = 0; i< theEmployee.size(); i++){
			result += theEmployee.get(i) + "\n";
		}
		return result;
	}
}
