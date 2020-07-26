package entites;

import java.util.List;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employees() {
	}	
	 
	
	public Employees(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	  public boolean hasId(List<Employees> list, int id) {
	    	Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	    		return emp !=  null;
	  }
	    		
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary+= (salary * percentage) / 100.0; 
	
	}


	public String toString() {
		return "ID:" + id + "\nName: " + name + "\nSalary: R$" + salary;
	}
	
}


	
	

