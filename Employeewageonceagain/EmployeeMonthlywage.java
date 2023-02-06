package com.Employeewageonceagain;

public class EmployeeMonthlywage {
    // Constants are written inside class outside main method
    static final int Full_time = 2;
    static final int Part_time = 1;
    static final int Wage_per_hour = 20;

    static final int Working_days_per_month = 20;

    public static void main(String[] args) {
        // Variables
        int Employee_working_hours = 0;
        int Employee_Wage = 0;
        int Monthly_Employee_wage = 0;

        // logic to get everyday employee wage
        for (int i = 0; i < Working_days_per_month; i++) {
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
            // Computation to get MonthlyWages and DailyWages
            Employee_Wage = Employee_working_hours * Wage_per_hour;
            Monthly_Employee_wage += Employee_Wage;
            System.out.println(" Employee_Wage: " + Employee_Wage);

        }
        System.out.println(" Monthly_Employee_Wage: " + Monthly_Employee_wage); // Displaying result
    }
}

