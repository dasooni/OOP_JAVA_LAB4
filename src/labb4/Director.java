package labb4;
import java.util.ArrayList;

public class Director extends Employee {
	
	private ArrayList<Worker> theWorkers;
	double bonus;
	
	public Director(String fName, String sName, int eNumber, double inPay) {
		super(fName, sName, eNumber, inPay);
		theWorkers = new ArrayList <Worker>();
		
	}

	void addEmployee(Worker arg){
//This instance method adds a worker to the list of subordinates of the director.
		 theWorkers.add(arg);
	}
	
	public double computeBonus(){
		for (int i = 0; i< theWorkers.size(); i++){
			bonus = (salary*0.10)*(i);
		}
		//bonus= 0.10 * bonus;
		return bonus;

		//returns the bonus received by the director.
	}
	
	public double computeTaxes(){
		//returns the taxes.
		double tax = (salary + computeBonus()) *0.25;
		return tax;
	}
	public int compareTo(Employee arg){
		
			if(sortCriterion == 0){
				if(secondName.compareTo(arg.secondName) == 0){
					return 0;
				}
				else if (secondName.compareTo(arg.secondName ) < 0){ 
					return -1;
				}
			
			else {
				return 1;
				}
			}
			else if (sortCriterion == BYSALARY) {
				if (salary == arg.salary){
					return 0;
				}
				else if (salary < arg.salary){
					return 1;
				}
				else {
					return -1;
				}
			}
			
			else{ 
				if(computeTaxes() == arg.computeTaxes()){
					return 0;
				}else if (computeTaxes() < arg.computeTaxes()){
					return 1;
				}
				else {
					return -1;
				}
			}
	}
	
}
