package controller;

import java.sql.SQLException;

import model.Employee;
import service.EmployeeServiceImpl;

public class EmployeeController {
	
	Employee refEmployee;
	EmployeeServiceImpl refEmployeeService;
	
	public void employeeProcess() throws SQLException {
		userInput();
	}
	
	void userInput() throws SQLException {
		
		refEmployee = new Employee();
		refEmployeeService = new EmployeeServiceImpl();
		
		//refEmployeeService.callAddEmployee(refEmployee);
		
		refEmployeeService.callUpdateEmployee(refEmployee);
	

}
}
