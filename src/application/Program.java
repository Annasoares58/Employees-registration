package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Employees;

public class Program {
		
	 public static void main(String[] args) {
	    	
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    	
	    List<Employees> list = new ArrayList<>();

	    System.out.print("How many employees will be registered? ");
	    int quantity = sc.nextInt();
	    for (int i= 0; i<quantity; i++) {
	    	Employees emp = new Employees();
	    	System.out.println("----------------------------------------");
	    	System.out.println("Emplyoee #" + (i + 1) + ":");
	    	System.out.print("Id: " );
	    	emp.setId(sc.nextInt());
	    	while(emp.hasId(list, emp.getId())) {
	    		System.out.println("Id already taken! Try again: ");
	    		emp.setId(sc.nextInt());
	    	}
	    	System.out.print("Name: ");
	    	sc.nextLine();
	    	emp.setName(sc.nextLine());
	    	System.out.print("Salary: ");
	    	emp.setSalary(sc.nextDouble());
	    	list.add(emp);
	    }
	    System.out.println("------------------------------------------");
	    System.out.print("Do you want to increase a salary? (S/N):  ");
	    sc.nextLine();
	    String resp = sc.nextLine();
	    if(resp.equalsIgnoreCase("S")) {
	    	System.out.println("------------------------------------------------------");
	   		System.out.println("Enter the employee Id that will have salary increase: ");
	   		int idSalary = sc.nextInt();
	   		Employees emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
	   		if (emp == null) {
    			System.out.println("This id does not exist!");
	    	}else {
	    		System.out.print("Enter the percentage: ");
	    		double percent = sc.nextDouble();
	    		emp.increaseSalary(percent);
			}
	    }
	    System.out.println("-----------------------------------------");
	   	System.out.println("*List of employees*");
	   	System.out.println();
	   	for (Employees emplo : list) {
	   		System.out.println(emplo);
	    	System.out.println("-------------------------------------");
		}
	    
	   	sc.close();
	    
	 }    
 }