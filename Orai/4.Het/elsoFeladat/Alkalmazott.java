package elsoFeladat;

public class Alkalmazott {
	protected String name;

	protected int salary;

	public void addToSalary(int amount){

		salary=salary+amount;

	}

	public String getNameAndSalary(){

		return name+" "+salary;

	}

}