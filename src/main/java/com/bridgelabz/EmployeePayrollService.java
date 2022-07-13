package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    /*
     *    Creating arrayList of EmployeePayrollData type: EmployeePayrollList
     */
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    /*
     *
     */
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeepayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    ;

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

    public void EmployeePayrollData() {
        System.out.println("\nEmployee Payroll is\n" + employeePayrollList);
    }

    public void printData(IOService ioService) {
        if (ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();

    }

    public long countEntries(IOService ioService) {
        long entries = 0;
        if (ioService.equals(IOService.FILE_IO))
            entries = new EmployeePayrollFileIOService().countEntries();
        return entries;
    }

    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }
}

