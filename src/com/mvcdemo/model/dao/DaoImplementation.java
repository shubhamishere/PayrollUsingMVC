package com.mvcdemo.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mvcdemo.model.constants.Constants;
import com.mvcdemo.model.pojo.Employee;

public class DaoImplementation implements Dao{
	int status;
	@Override
	public void storeDailyTypeDataInDb(Employee emp, Connection con) {

		try {
			PreparedStatement pst = 
					con.prepareStatement("insert into " + Constants.EMPLOYEE_TABLE_NAME + " (empType, fullName, email, workedHours, paybleSalary) values(?,?,?,?,?)");
			pst.setString(1, emp.getEmployeeType());
			pst.setString(2, emp.getFullName());
			pst.setString(3, emp.getEmail());
			pst.setInt(4, emp.getWorkedHours());
			pst.setFloat(5, emp.getPaybleSalary());

			status = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void storeSalariedTypeDataInDb(Employee emp, Connection con) {

		try {
			PreparedStatement pst = con.prepareStatement(
					"insert into " + Constants.EMPLOYEE_TABLE_NAME + " (empType, fullName, email, paybleSalary) values(?,?,?,?)");
			pst.setString(1, emp.getEmployeeType());
			pst.setString(2, emp.getFullName());
			pst.setString(3, emp.getEmail());
			pst.setFloat(4, emp.getPaybleSalary());

			status = pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void storeCommissionTypeDataInDb(Employee emp, Connection con) {

		try {
			PreparedStatement pst = con.prepareStatement(
					"insert into "+Constants.EMPLOYEE_TABLE_NAME+" (empType, fullName, email, saleAmount, paybleSalary) values(?,?,?,?,?)");
			pst.setString(1, emp.getEmployeeType());
			pst.setString(2, emp.getFullName());
			pst.setString(3, emp.getEmail());
			pst.setInt(4, emp.getSaleAmount());
			pst.setFloat(5, emp.getPaybleSalary());

			status = pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public ResultSet searchForEmp(String searchEmail, Connection con) {
		ResultSet rs = null;
		try {
			PreparedStatement pst = con.prepareStatement("select * from " + Constants.EMPLOYEE_TABLE_NAME + " where email=(?)");
			pst.setString(1, searchEmail);
			rs = pst.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return rs;
	}

	@Override
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName(Constants.NAME);
			con = DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASS);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	
	return con;
	
	}
	
	public String checkIfDataInserted() {
		if (status == 1) {
			return "Employee details added successfully to the database.";
		} else {
			return "Unable to add employee details to the database.";
		}
	}
}
