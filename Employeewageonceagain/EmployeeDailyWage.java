package com.Employeewageonceagain;

public class EmployeeDailyWage {
    public static void main(String[] args) {
        // constant
        int Full_time = 1;
        int Wage_per_hour = 20;
        // Variables
        int Employee_hours = 0;
        int Employee_Wage = 0;
        // To get random numbers
        double Employeecheck = Math.floor(Math.random() * 10) % 2;
        if (Employeecheck == Full_time)
            Employee_hours = 8;
        else
            Employee_hours = 0;
        // Computation to get the Employee_Wage
        Employee_Wage = Employee_hours * Wage_per_hour;
        System.out.println(" EmployeeWage:   " + Employee_Wage); // Displaying result
    }
}


