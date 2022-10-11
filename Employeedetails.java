package week1.day2;

public class Employeedetails { 
public void employeeName()
{
	String EmployeName= "Shivashankari";
	 int EmployeID = 261;
	 System.out.println("Employe Name = "+EmployeName);
	 System.out.println("Employe ID = "+EmployeID);
	}
	public void employeeAdress() {
	String EmployeeAdress = "Thanjavur";
	System.out.println("Employee Adress = "+EmployeeAdress);
	}
	public void EmployeeSalary() {
		Double EmployeWage = 85367.75836;
		System.out.println("Employe Salary = Rs "+EmployeWage+"/-");
	}
	public void EmployeeMobileNumber() {
		Long MobileNumber = 567435698L;
		System.out.println("Employee Mobile Number = "+MobileNumber);
	}
	public static void main(String[] args) {
		Employeedetails details = new Employeedetails();
		details.employeeName();
		details.employeeAdress();
		details.EmployeeSalary();
		details.EmployeeMobileNumber();
		
		
		
		
		
	
}

}
	

