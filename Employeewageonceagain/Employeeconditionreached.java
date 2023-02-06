package com.Employeewageonceagain;

public class Employeeconditionreached {
    public static final int part_Time = 1;
    public static final int fullTime = 2;
    public static final int emprateperhour = 20;
    public static final int numberofworkingdays = 20;
    public static final int maximumhoursinmonth = 100;

    public static void main(String[] args) {
        int employeeHours = 0, totalEmployeeHours = 0;
        int totalWorkingDays = 0;
        while (totalEmployeeHours <= maximumhoursinmonth && totalWorkingDays < numberofworkingdays) {
            totalWorkingDays++;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case part_Time:
                    employeeHours = 4;
                    break;
                case fullTime:
                    employeeHours = 8;
                    break;
                default:
                    employeeHours = 0;
            }
            totalEmployeeHours += employeeHours;
            System.out.println("Day : " + totalWorkingDays + " employee hours: " + employeeHours);
        }
        int totalEmployeeWage = totalEmployeeHours * emprateperhour;
        System.out.println("Total Employee Wage: " + totalEmployeeWage);
    }

}