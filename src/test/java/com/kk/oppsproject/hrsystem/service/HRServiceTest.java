package com.kk.oppsproject.hrsystem.service;

import com.kk.oppsproject.hrsystem.entity.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HRServiceTest {

    HRService hrService;
    Employee employee1,employee2;
    List<Role> rolesOfJoe = new ArrayList<>();
    List<Role> rolesOfDonal= new ArrayList<>();
    List<Employee> listOfEmployees = new ArrayList<>();

    @BeforeEach
    public void init(){
        hrService = new HRService();
        rolesOfJoe.add(new Role(100, "Current President"));
        rolesOfJoe.add(new Role(101, "Current Leader"));
        employee1 = new Employee(12,"Joe","Biden",new Phone("469","256487","+1"),
                new Address("98523","USA","Washington","Kent","116th Ave Kent", "Unit 928"),rolesOfJoe,false,true);
        rolesOfDonal.add(new Role(100, "X-President"));
        rolesOfDonal.add(new Role(101, "X-Leader"));
        employee2= new Employee(11,"Donal","Trump",new Phone("253","2850245","+1"),
                new Address("76969","USA","Texas","Irving","3309 Esters Rd", "Apt 116"),rolesOfDonal,true,false);
       listOfEmployees.add(employee2);
       listOfEmployees.add(employee1);
    }


    @Test
    @DisplayName("if addEmployee method is working as expected")
    void testAddEmployee() {
        assertAll(
                () -> assertEquals(Status.SUCCESS,hrService.addEmployee(1, employee1),"with companyId (1)"),
                () -> assertEquals(Status.FAILURE,hrService.addEmployee(0,employee1),"with companyId(0) which is not present in db"),
                () -> assertEquals(Status.FAILURE,hrService.addEmployee(100,employee1),"with companyId(100) which is not present in db")
        );

    }

    @Test
    @DisplayName("if removeEmployee method is working as expected")
    void testRemoveEmployee() {
        assertAll(
                () -> assertEquals(Status.SUCCESS,hrService.removeEmployee(1,11),"with companyId (1) and userId(11) which is present because of constructor"),
                () -> assertEquals(Status.SUCCESS,hrService.removeEmployee(1,12),"with companyId (1) and userId(12) which is present because of constructor"),
                () -> assertEquals(Status.FAILURE,hrService.removeEmployee(1,0),"with valid company id but not the right userId"),
                () -> assertEquals(Status.FAILURE,hrService.removeEmployee(2,11),"with invalid company id but valid userId")
        );

    }

    @Test
    @DisplayName("if search method with company id and user id/employee id is working as expected")
    void testSearchWithCompanyIdAndEmployeeId() {
        assertAll(
                () -> assertNotNull(hrService.search(1,12),"with valid companyId and valid employeeId"),
                () -> assertEquals(null,hrService.search(0,12),"with invalid company id and valid userId/employee id"),
                () -> assertNull(hrService.search(1,0),"with valid company id and invalid userId/employee id")
        );

    }

    @Test
    @DisplayName("if search method with company id and user first name and lastname id is working as expected")
    void testSearchWithFirstnameAndLastname() {
        assertAll(
                () -> assertNotNull(hrService.search(1,"Joe","Biden"),"with valid companyId and valid name"),
                () -> assertEquals(null,hrService.search(2,"Joe","Biden"),"with invalid company id but valid name"),
                () -> assertNull(hrService.search(1,"Invalid","Name"),"with valid company id but invalid name")
        );

    }
}
