package com.kk.oppsproject.hrsystem.client;

import com.kk.oppsproject.hrsystem.entity.Address;
import com.kk.oppsproject.hrsystem.entity.Employee;
import com.kk.oppsproject.hrsystem.entity.Phone;
import com.kk.oppsproject.hrsystem.entity.Role;
import com.kk.oppsproject.hrsystem.service.HRService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TransactionPicker {
    public static void pickTransaction(){
        HRService hrService = new HRService();
        Scanner input = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter a option what you whant to perform!\n\n"
                    + "1. Add a employee\n"
                    + "2. Search a employee\n"
                    + "3. Remove a employee\n"
                    + "99. to exit the program");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter CompanyId to add the Employee to that company");
                    int companyId = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter empId");
                    int empId = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter firstName");
                    String firstName = input.nextLine();

                    System.out.println();
                    System.out.println("Enter lastName");
                    String lastName = input.nextLine();

                    System.out.println("Enter your phone information below:");

                    System.out.println("Enter areaCode");
                    String areaCode = input.nextLine();

                    System.out.println("Enter number");
                    String number = input.nextLine();

                    System.out.println("Enter CountryCode");
                    String countryCode = input.nextLine();

                    System.out.println("Enter your Address information below:");

                    System.out.println("Enter zipCode\n");
                    String zipCode = input.nextLine();

                    System.out.println("Enter Country\n");
                    String country = input.nextLine();

                    System.out.println("Enter State\n");
                    String state = input.nextLine();

                    System.out.println("Enter City\n");
                    String city = input.nextLine();

                    System.out.println("Enter Line1\n");
                    String line1 = input.nextLine();

                    System.out.println("Enter Line2\n");
                    String line2 = input.nextLine();

                    System.out.println("Enter RoleName\n");
                    String roleName = input.nextLine();

                    System.out.println("Enter if the employee is Contractor(true/false)");
                    Boolean isContractor = input.nextBoolean();

                    System.out.println("Enter if the employee is FullTime(true/false)");
                    Boolean isFullTime = input.nextBoolean();

                    Role[] roles = {new Role(0, roleName)};

                    Employee employee = new Employee(empId, firstName, lastName, new Phone(areaCode, number, countryCode), new Address(zipCode, country, state, city, line1, line2), roles, isContractor, isFullTime);
                    hrService.addEmployee(companyId, employee);
                    break;
                case 2:
                    System.out.println("Enter 1 to search by companyId && userId\n");
                    System.out.println("Enter 2 to search by companyId, first name and last name ");
                    int searchChoose = input.nextInt();
                    switch (searchChoose) {
                        case 1:
                            System.out.println("Enter company Id to search:");
                            companyId = input.nextInt();
                            System.out.println("Enter employeeID to search:");
                            int employeeID = input.nextInt();
                            System.out.println(hrService.search(companyId, employeeID).toString());
                            break;
                        case 2:
                            System.out.println("Enter company Id to search:");
                            companyId = input.nextInt();
                            input.nextLine();
                            System.out.println("Enter firstName to search:");
                            firstName = input.nextLine();
                            System.out.println("Enter lastName to search:");
                            lastName = input.nextLine();
                            System.out.println(hrService.search(companyId, firstName, lastName).toString());
                            break;
                        default:
                            System.out.println("Your choice is out of range please try again");
                    }
                    break;
                case 3:
                    System.out.println("Enter company Id to remove:");
                    companyId = input.nextInt();
                    System.out.println("Enter employeeID to remove:");
                    int employeeID = input.nextInt();
                    hrService.removeEmployee(companyId, employeeID);
                    break;
                default:
                    System.out.println("Please try again!!!");
            }
        }while (choice!=99);
    }
}
