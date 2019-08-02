package application;

import java.sql.SQLException;

import controller.EmployeeController;

public class EmployeeApplication {
	
	public static void main(String[] args) throws SQLException {
		
		EmployeeController employeeControllerRef = new EmployeeController();
		employeeControllerRef.employeeProcess();
		
		
		
		
	}

}
