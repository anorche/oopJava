package elsoFeladat;

public class AlkalmazottHasznalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alkalmazott employee=new Alkalmazott();

		employee.name="Nagy Endre";

		employee.salary=250000;

		System.out.println(employee.getNameAndSalary());

		employee.addToSalary(2500);

		System.out.println(employee.getNameAndSalary());
	}

}
