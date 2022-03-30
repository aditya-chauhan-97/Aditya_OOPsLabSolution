package oopsLabPackage;

public class Employee {

	String firstName;
	String lastName;
	String[] departmentList;
	String[] departmentListShort;
	String department;
	
	Employee(){
		departmentList = new String[] {"Technical","Admin","Human Resource","Legal"};
		departmentListShort = new String[] {"tech","adm","hr","lg"};
	}
	
	Employee(String firstName,String lastName){
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setDepartment(int departmentChoice) {
		department = departmentListShort[departmentChoice-1];
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void displayDepartment() {
		for(int i=0;i<departmentList.length;i++) {
			System.out.println(i + 1 + ". " + departmentList[i]);
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}


