package com.Employeewageonceagain;

public class EmployeeSwitchcase {
    // Constants are written inside class outside main method
    static final int Full_time = 2;
    static final int Part_time = 1;
    static final int Wage_per_hour = 20;

    public static void main(String[] args) {
        // Variables
        int Employee_working_hours = 0;
        int Employee_Wage = 0;
        double Employeecheck = Math.floor(Math.random() * 10) % 3;
        // Checking Employee working hours using Switch case
        switch ((int) Employeecheck) {
            case Part_time:
                Employee_working_hours = 4;
                break;
            case Full_time:
                Employee_working_hours = 8;
                break;
            default:
                Employee_working_hours = 0;
        }
        // Computation to get EmployeeWages
        Employee_Wage = Employee_working_hours * Wage_per_hour;
        System.out.println(" Employee_Wage: " + Employee_Wage); // Displaying result
    }
}

