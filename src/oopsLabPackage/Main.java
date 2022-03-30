package oopsLabPackage;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Employee employee = new Employee("Aditya","Chauhan");
		
		System.out.println("Please enter the department from the following");
		employee.displayDepartment();
		
		Scanner sc= new Scanner(System.in);
		employee.setDepartment(sc.nextInt());
		sc.close();
		
		CredentialService credentialsObj = new CredentialService();
		credentialsObj.displayCredentials(employee);
	}

}
