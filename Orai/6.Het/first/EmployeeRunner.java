package first;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		System.out.println("The number of employees: ");
		Scanner in=new Scanner(System.in);
		n=Integer.parseInt(in.nextLine());
		Employee[] employees=new Employee[n];
		for(int i=0;i<employees.length;i++){
			System.out.println("Name:");
			String name=in.nextLine();
			System.out.println("Age:");
			int age=Integer.parseInt(in.nextLine());
			System.out.println("Salary:");
			int salary=Integer.parseInt(in.nextLine());
			employees[i]=new Employee(name,age,salary);
		}
		for(int i=0;i<employees.length;i++){
			System.out.println(employees[i].getDetails());
			employees[i].setRetiringAge(60);
			System.out.println(employees[i].getDetails());
		}
		for(int i=0;i<employees.length;i++){
			if(employees[i].getAgeToRetiring()<5){
				System.out.println(employees[i].getDetails());
			}
		}
		double averageAgeToRetiring=0.0;
		for(int i=0;i<employees.length;i++){
			averageAgeToRetiring+=employees[i].getAgeToRetiring();
		}
		averageAgeToRetiring/=employees.length;
		for(int i=0;i<employees.length;i++){
			if(employees[i].getAgeToRetiring()>averageAgeToRetiring){
				System.out.println(employees[i].getDetails());
			}
		}
	
		for(int i=0;i<employees.length;i++){
			for(int j=i;j<employees.length;j++){
			if(Employee.getSmallerRetiringAge(employees[i], employees[j])==employees[i]){
				Employee temp=employees[i];
				employees[i]=employees[j];
				employees[j]=temp;
			}
			}
		}
		for(int i=0;i<employees.length;i++){
			System.out.println(employees[i].getDetails());
		}

	}
}
