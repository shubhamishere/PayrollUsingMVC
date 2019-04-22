package com.mvcdemo.controller.myservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcdemo.model.dao.Dao;
import com.mvcdemo.model.dao.DaoImplementation;

import java.sql.*;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	Dao dao = new DaoImplementation();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchEmail = request.getParameter("searchEmail");
		
		Connection con = dao.getConnection();
		ResultSet rs = dao.searchForEmp(searchEmail, con);
		try {
			while(rs.next()) {
				request.setAttribute("fullName", rs.getString("fullName"));
				request.setAttribute("email", rs.getString("email"));
				request.setAttribute("empType", rs.getString("empType"));
				request.setAttribute("workedHours", rs.getInt("workedHours"));
				request.setAttribute("saleAmount", rs.getInt("saleAmount"));
				request.setAttribute("paybleSalary", rs.getInt("paybleSalary"));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/SearchResult.jsp");
		rd.forward(request, response);
		
	}

}

