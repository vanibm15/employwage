package com.bridgelabz;

public class Employwage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDaysPerMonth,
                                     int maxWorkingHoursPerMonth) {
        System.out.println("Welcome to Employee Wage Program for Multiple Companies.");
        int empHrs = 0;
        int monthlyEmpWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;
        while (totalWorkingHrs <= maxWorkingHoursPerMonth && totalWorkingDays < numOfWorkingDaysPerMonth) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalWorkingHrs += empHrs;
            System.out.println("#DAY : " + totalWorkingDays + " , #Total Working Hours : " + totalWorkingHrs);
        }
        monthlyEmpWage = totalWorkingHrs * empRatePerHour;
        System.out.println("Employee Wage for a Month: " + monthlyEmpWage);
        return monthlyEmpWage;
    }

    public static void main(String[] args) {
        System.out.println(" Infoysis");
        computeEmpWage("MindTree", 20, 10, 30);
        System.out.println();
        System.out.println("Dell ");
        computeEmpWage("Dell", 10, 20, 40);
    }
}