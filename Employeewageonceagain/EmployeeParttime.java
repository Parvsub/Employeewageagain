package com.Employeewageonceagain;

public class EmployeeParttime {
    public static void main(String[] args) {
        //Constants
        int Full_time = 2;
        int Part_time = 1;
        int Wage_per_hour = 20;
        //Varibles declaration and initialization
        int Employee_hours = 0;
        int Employee_Wage = 0;
        //To get random numbers
        double Employeecheck = Math.floor(Math.random() * 10) % 3;
        if (Employeecheck == Full_time)
            Employee_hours = 8;
        else if (Employeecheck == Part_time)
            Employee_hours = 4;
        else
            Employee_hours = 0;
        // Computation to get DailyEmployeeWages
        Employee_Wage = Employee_hours * Wage_per_hour;
        System.out.println(" Employee_Wage = " + Employee_Wage); // Displaying result

    }

}


