package com.mvcdemo.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.mvcdemo.model.pojo.Employee;

public interface Dao {
	void storeDailyTypeDataInDb(Employee emp, Connection con);
	void storeSalariedTypeDataInDb(Employee emp, Connection con);
	void storeCommissionTypeDataInDb(Employee emp, Connection con);
	Connection getConnection();
	public ResultSet searchForEmp(String searchEmail, Connection con);
	public String checkIfDataInserted();
}
