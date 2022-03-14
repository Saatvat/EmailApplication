package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter FirsName and LastName below - ");
		Employee emp = new Employee(sc.next(), sc.next());
		System.out.println("\nFirstName: " + emp.getfirstName() + " LastName: " + emp.getlastName() + "\n");
		
		System.out.println("Please enter the department from the following");
		System.out.print("1.  Technical \n2.  Admin \n3.  Human Resource \n4.  Legal\n");
		
		emp.employee(sc.nextInt());
		
		sc.close(); 
		
		CredentialService service = new CredentialService();
		String email = service.generateEmailAddress(emp.getfirstName(), emp.getlastName(), emp.getDepartment());
		String password = service.generatePassword();
		service.showCredentials(emp.getfirstName(), email, password);
	}

}
