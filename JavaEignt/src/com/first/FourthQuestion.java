package com.first;
/**
 * Question 4: Create an Employee Class with instance variables
 * (String) employeeName, (Integer) employeeAge, (String) employeeCity and get the
 * instance of the Class using constructor reference
 */

@FunctionalInterface
interface EmployeeReference {
    FourthQuestion makeEmployee(String empName, int empAge, String empCity);
}

public class FourthQuestion {
    String employeeName;
    int employeeAge;
    String employeeCity;

    FourthQuestion(String employeeName, int employeeAge, String employeeCity) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeCity = employeeCity;
    }

    void getEmployee() {
        System.out.println(this.employeeName + " is " + this.employeeAge + " and lives at " + this.employeeCity + ".");
    }

    public static void main(String[] args) {
        EmployeeReference employeeReference = FourthQuestion::new;
        FourthQuestion employee = employeeReference.makeEmployee("Saurabh", 24, "Ghaziabad");
        employee.getEmployee();
    }
}