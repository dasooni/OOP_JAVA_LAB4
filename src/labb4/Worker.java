package labb4;

public class Worker extends Employee{

	public Worker(String arg1, String arg2, int arg3, double arg4) {
		super(arg1, arg2, arg3, arg4);
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Employee arg4) {
		if(sortCriterion == BYNAME){
			if(secondName.compareTo(arg4.secondName) == 0){
				return 0;
			}
			else if (secondName.compareTo(arg4.secondName ) < 0){ 
				return -1;
			}
		
		else {
			return 1;
			}
		}
		else if (sortCriterion == BYSALARY) {
			if (salary == arg4.salary){
				return 0;
			}
			else if (salary < arg4.salary){
				return 1;
			}
			else {
				return -1;
			}
		}
		
		else{ 
			if(computeTaxes() == arg4.computeTaxes()){
				return 0;
			}else if (computeTaxes() < arg4.computeTaxes()){
				return 1;
			}
			else {
				return -1;
			}
		}

		// This instance method compares two employees.
		// returns a value -1, 0, 1 depending on if the salary of this employee is higher, equal or lower than that of arg.
	}

	public double computeTaxes() {
		
		return 0.25*salary;
		//This instance method computes the taxes the worker has to pay.
	}
	

}
