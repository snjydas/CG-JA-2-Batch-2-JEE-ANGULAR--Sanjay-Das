package com.cg.eis.service;

import com.cg.eis.bean.*;

interface EmployeeServiceInterface {

	void insurance(double sal);

	void input(String empid, String name, double sal, String desig);

	void display();
}
