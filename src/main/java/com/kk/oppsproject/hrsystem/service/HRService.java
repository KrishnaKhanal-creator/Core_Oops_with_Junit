package com.kk.oppsproject.hrsystem.service;

import com.kk.oppsproject.hrsystem.entity.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HRService {
	private Map<Integer, Company> db = null;
	List<Employee> employees = new ArrayList<>();
	List<Role> rolesOfTrump = new ArrayList<>();
	List<Role> rolesOfJoe = new ArrayList<>();
	Company company = null;

	public HRService() {
		db = new HashMap<>();
		rolesOfTrump.add(new Role(100,"X-President"));
		rolesOfTrump.add(new Role(101,"X-Leader"));
		employees.add(new Employee(11,"Donal","Trump",new Phone("253","2850245","+1"),
				new Address("76969","USA","Texas","Irving","3309 Esters Rd", "Apt 116"),rolesOfTrump,true,false));
		rolesOfJoe.add(new Role(100,"Current President"));
		rolesOfJoe.add(new Role(101,"Current Leader"));
		employees.add(new Employee(12,"Joe","Biden",new Phone("469","256487","+1"),
				new Address("98523","USA","Washington","Kent","116th Ave Kent", "Unit 928"),rolesOfJoe,false,true));
		db.put(1,new Company(1,"IMCS", employees));
	}

	public Status addEmployee(int companyId, Employee employee) {
		Company company = db.get(companyId);
		if(company!=null){
			employees.add(employee);
			System.out.println("Employee added Successfully!!\n\n");
			System.out.println("Your have these employees so far:     " + db.get(companyId).toString());
			return Status.SUCCESS;
		}
		return Status.FAILURE;
	}

	public Status removeEmployee(int companyId, int userId) {
		company = db.get(companyId);
		if(company!=null){
			employees = company.getEmployees();
			for(int i=0;i<employees.size();i++){
				if(userId == employees.get(i).getId()) {
					employees.remove(i);
					System.out.println("Employee removed Successfully!!");
					return Status.SUCCESS;
				}
			}
		}
		System.out.println("No employee found…please modify search parameters");
		return Status.FAILURE;
	}

	public List<Employee> search(int companyId, String firstName, String lastName) {
		company = db.get(companyId);
		List<Employee> employees;
		if(company!=null){
			employees = company.getEmployees();
			for (int i = 0; i < employees.size(); i++){
				if(firstName.equals(employees.get(i).getFirstName()) && lastName.equals(employees.get(i).getLastName())){
					System.out.println("Employee found Successfully!! \n\n 		");
					return  employees;
				}
			}
		}
		System.out.println("No employee found…please modify search parameters");
		return null;
	}

	public Employee search ( int companyId, int employeeId) {
		company = db.get(companyId);
		if (company != null) {
			List<Employee> employees = company.getEmployees();
			for (int i = 0; i < employees.size(); i++) {
				if (employeeId == employees.get(i).getId()) {
					System.out.println("Employee found Successfully!!\n\n		");
					return employees.get(i);
				}
			}
		}
		System.out.println("No employee found…please modify search parameters");
		return null;
	}
}
