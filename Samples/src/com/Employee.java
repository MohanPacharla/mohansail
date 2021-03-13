package com;

public class Employee {
    private int empNo;
    private String empName;
    private double salary;
    public int getEmpNo() {
        return empNo;
    }
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void Employee() {
        
    }
    
    @Override
    public String toString() {
        return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
    }
    public Employee() {
        
    }
    public Employee(int empNo, String empName, double salary) {
        super();
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }
    
    

 

}
 