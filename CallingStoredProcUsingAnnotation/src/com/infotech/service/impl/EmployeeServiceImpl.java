package com.infotech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public Employee fetchEmployeeNamAndSalaryById(int employeeId) {
		return employeeDAO.getEmployeeNamAndSalaryById(employeeId);
	}

}
