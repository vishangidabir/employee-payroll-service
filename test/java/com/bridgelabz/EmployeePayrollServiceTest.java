package com.bridgelabz;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
                new EmployeePayrollData(2, "Bill Gates", 200000.0),
                new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0)
        };
        EmployeePayrollService employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayRollService.printData(EmployeePayrollService.IOService.FILE_IO);
    }
}