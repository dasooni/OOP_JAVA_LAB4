package labb4;

import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Lab4 extends Object{

	public static void main(String[] args) {
		
		Company theCompany = new Company();
				
		/* Directors are created as objects with an own reference variable because they are added to 
                 * Workers. The entries in the constructor are the first name, surname, employee number and salary. */
		
		Director director1 = new Director("John", "Smith", 1, 700000.0);
		Director director2 = new Director("Elaine", "Garret", 2, 670000.0);
		
		// We add the directors to the company
		
		theCompany.addEmployee(director1); theCompany.addEmployee(director2);
		
		// We add workers to the company and assign them to a director. 
		
		theCompany.addEmployee(new Worker("Paul", "Johnson", 3, 400000.0),director1);
		theCompany.addEmployee(new Worker("Sarah", "Davidson", 4, 420000.0),director1);
		theCompany.addEmployee(new Worker("Doris","McClure", 5, 470000.0),director1);
		theCompany.addEmployee(new Worker("James", "Adams", 6, 340000.0),director1);
		theCompany.addEmployee(new Worker("Sam", "Cooper", 7, 460000.0),director2);
		theCompany.addEmployee(new Worker("Andrea","Lester", 8, 460000.0),director2);
		theCompany.addEmployee(new Worker("Olga", "Gibbs", 9, 420000.0),director2);
		
		//Here we change the sorting criterium using the class constants of Employee: 
		//BYNAME = 0, BYSALARY = 1, BYTAXES = 2.
		Employee.changeCriterion(Employee.BYSALARY);
		System.out.println(theCompany);
		Employee.changeCriterion(Employee.BYNAME);
		System.out.println(theCompany);
		Employee.changeCriterion(Employee.BYTAXES);
		System.out.println(theCompany);
		


	}
}
