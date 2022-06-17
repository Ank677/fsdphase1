package employeejava;

import java.util.Scanner;

public class employee {
	 int employeeId;
	 String Name;
 String fathersName;
 //Scanner sc =new Scanner(System.in);
// int employeeWorkCode=sc.nextInt();
// String mothersName=sc.nextLine();
 
 
 
	void EmployeeDetail() {
		System.out.println(employeeId);
	}
	void employeedetails(int employeeWorkCode,String mothersName){
		this.employeeId=employeeWorkCode;
		this.fathersName=mothersName;
		
	}
	public class setvalue {
		employee obj=new employee();
		obj.setemployeeId(123);
	}
}

