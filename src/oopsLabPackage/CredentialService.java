package oopsLabPackage;

import java.util.Random;

public class CredentialService {

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String[] validValues = new String[] {capitalLetters,smallLetters,numbers,specialCharacters};

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		int i = 0;
		Random random = new Random();
		char[] password = new char[8];
		
		for (i = 0; i < validValues.length; i++) {
			password[i] = validValues[i].charAt(random.nextInt(validValues[i].length()));

		}
	
		for (; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}	
		
		return password;
	}
	
	public String generateEmailAddress(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment() + ".abc.com";
	}
	
	public void displayCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email --> " + generateEmailAddress(employee));
		System.out.print("Password --> ");
		System.out.print(generatePassword());
	}
}
