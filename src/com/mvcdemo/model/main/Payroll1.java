package com.mvcdemo.model.main;

import java.util.Scanner;

import com.mvcdemo.model.action.Payroll;
import com.mvcdemo.model.dao.DaoImplementation;
import com.mvcdemo.model.pojo.Employee;

import java.sql.*;

public class Payroll1 {/*
	public static Employee emp = new Employee();
	public static DaoImplementation dao = new DaoImplementation();
	public static String empType;
	public static void main(String[] args) throws SQLException {
		
		Connection con = Utility.getConnection();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Choose the operation you want to perform:\n 1.) Add employees details\n"
					+ " 2.) Search for employees using email\n 3.) Exit\n Enter your choice: ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Create employee entries: ");
				System.out.println("------------------------");
				System.out.println("Select type of employee: ");
				System.out.println("1.) Daily\n2.) Salaried\n3.) Commission");
				System.out.print("Enter: ");
				int choice = sc.nextInt();
				sc.nextLine();

				
				if (choice == 1) {
					empType = "Daily";
				} else if (choice == 2) {
					empType = "Salaried";
				} else if (choice == 3) {
					empType = "Commission";
				} else {
					System.out.println("Enter valid input! Try again.\n\n");
					continue;
				}
				
				
				System.out.print("Enter full name of " + empType + " employee: ");
				String fullName = sc.nextLine();
				emp.setFullName(fullName);

				System.out.print("Enter email id of " + empType + " employee: ");
				String email = sc.nextLine();
				emp.setEmail(email);

				
				 * Fill the pending employee info
				 

				fillUserInformation(choice, con, dao, sc);
				break;

			case 2:

				// Search the entered email in the database.
				System.out.print("Enter email to search for employee: ");
				String searchEmail = sc.nextLine();
				searchEmailInDatabase(searchEmail, con);
				break;

			case 3:
				System.out.println("Thank you.");
				System.exit(0);

			}

		}

		while (true);
	}

	private static void searchEmailInDatabase(String searchEmail, Connection con) throws SQLException {
		PreparedStatement pst = con.prepareStatement("select * from");
		pst.setString(1, searchEmail);
	}

	*//**
	 * Fill user pending info
	 * 
	 * @param choice
	 * @param con
	 * @param dao
	 * @param sc
	 *//*

	private static void fillUserInformation(int choice, Connection con, DaoImplementation dao, Scanner sc) {
		switch (choice) {
		*//**
		 * -----Daily/hourly basis employee-----
		 *//*
		case 1:
			emp.setEmployeeType(empType);
			System.out.print("Hours worked: ");
			int hoursWorked = sc.nextInt();
			emp.setWorkedHours(hoursWorked);
			
			
			 * Calculation part to set the paybleSalary method
			 
			

			
			 * Inserting values of daily basis employees from its emp object into the DB
			 * table.
			 

			dao.storeDailyTypeDataInDb(emp, con);
			
			break;

		case 2:
			
			 * Salary-basis employee
			 
			emp.setEmployeeType(empType);
			System.out.print("Enter salary: ");
			int salary = sc.nextInt();
			emp.setPaybleSalary(salary);

			
			 * Inserting values of salaried employees from its emp object into the DB table.
			 
			dao.storeSalariedTypeDataInDb(emp, con);

			break;

		case 3:
			
			 * Commission-basis employee
			 
			System.out.print("Enter the amount of sale: ");
			int amountOfSale = sc.nextInt();
			emp.setSaleAmount(amountOfSale);

			
			 * Using utility class to to the calculation part
			 
			Utility.calculateAndSetPaybleCommissionSalary();

			
			 * Inserting values of daily basis employees from its emp object into the DB
			 * table.
			 
			dao.storeCommissionTypeDataInDb(emp, con);

			break;
		}

	}

*/}
