package dao;

import java.sql.SQLException;

import model.Employee;


public interface EmployeeDAO {
	
	public void addEmployee(Employee refEmployee) throws SQLException;
	
	public void updateEmployee(Employee refEmployee) throws SQLException;


	}


