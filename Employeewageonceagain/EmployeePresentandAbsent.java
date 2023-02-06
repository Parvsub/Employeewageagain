package com.Employeewageonceagain;

public class EmployeePresentandAbsent {
    public static void main(String[] args) {
        int Full_time = 1;  // constants
        // To get random number and check the Attendance
        double Employeecheck = (Math.floor(Math.random() * 10) % 2);
        if (Employeecheck == Full_time)  // Logic to get Employee Attendance
            System.out.println(" Employee is Present ");
        else
            System.out.println(" Employee is Absent ");

    }
}