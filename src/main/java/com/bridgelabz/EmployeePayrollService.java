package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }
    /*
     *    Creating arrayList of EmployeePayrollData type: EmployeePayrollList
     */
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();;
     /*
      *
      */
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeepayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }

    private void writeEmployeePayrollData() {

        System.out.println("\nEmployee Payroll is\n" + employeePayrollList);
    }

    private void readEmployeepayrollData(Scanner consoleInputReader) {

        System.out.println("Enter Employee Name");
        String Name = consoleInputReader.nextLine();
        System.out.println("Enter Employee ID");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, Name, salary));

    }

}
