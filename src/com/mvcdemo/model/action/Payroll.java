package com.mvcdemo.model.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mvcdemo.controller.myservlets.FirstServlet;
import com.mvcdemo.model.constants.*;
import com.mvcdemo.model.main.*;
import com.mvcdemo.model.pojo.Employee;

public class Payroll {

	/**
	 * 
	 * 
	 * @return sql Connection
	 */

	/**
	 * 
	 * @param hours
	 */

	public static void calculateDailyAmountAndSetPaybleSalary(Employee emp, int workedHours) {
		int rate = 70;
		int salary = workedHours * rate;
		emp.setPaybleSalary(salary);
		emp.setWorkedHours(workedHours);
	}

	/**
	 * 
	 */

	public static void calculateAndSetPaybleCommissionSalary(Employee emp ,int saleAmount) {
		// commission amount = 15% of weekly sales.
		emp.setSaleAmount(saleAmount);
		float commissionPercent = 15;
		float amount = saleAmount;
		float salary = (commissionPercent / 100) * amount;
		emp.setPaybleSalary(salary);
	}

}
