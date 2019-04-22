package com.mvcdemo.controller.myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcdemo.model.action.Payroll;
import com.mvcdemo.model.dao.Dao;
import com.mvcdemo.model.dao.DaoImplementation;
import com.mvcdemo.model.pojo.Employee;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	
		
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Employee emp = new Employee();
		Dao dao = new DaoImplementation();
		Connection con = dao.getConnection();
		
		PrintWriter writer = response.getWriter();
    	
    	String name = request.getParameter("fullName"); 
    	String email = request.getParameter("email");
    	String empType = request.getParameter("employee");
    	String dataInsertionCheck = null;
    	
    	emp.setFullName(name);
    	emp.setEmail(email);
    	emp.setEmployeeType(empType);
    	
    	
    	if(empType.equalsIgnoreCase("Salaried")) {
    		float paybleSalary = Integer.parseInt(request.getParameter("pay"));
    		emp.setPaybleSalary(paybleSalary);
    		dao.storeSalariedTypeDataInDb(emp, con);
    		dataInsertionCheck = dao.checkIfDataInserted();
    	}
    	else if(empType.equalsIgnoreCase("Commissioned")) {
    		int saleAmount = Integer.parseInt(request.getParameter("sales"));
    		Payroll.calculateAndSetPaybleCommissionSalary(emp, saleAmount);
    		dao.storeCommissionTypeDataInDb(emp, con);
    		dataInsertionCheck = dao.checkIfDataInserted();
    	}
    	else if(empType.equalsIgnoreCase("Hourly")) {
    		int workedHours = Integer.parseInt(request.getParameter("hours"));
    		Payroll.calculateDailyAmountAndSetPaybleSalary(emp, workedHours);
    		dao.storeDailyTypeDataInDb(emp, con);
    		dataInsertionCheck = dao.checkIfDataInserted();
    	}
    	
    	request.setAttribute("dataInsertionCheck", dataInsertionCheck);
    	RequestDispatcher rd = request.getRequestDispatcher("/Show.jsp");
    	rd.forward(request, response);
    	    	
	}
	
}
