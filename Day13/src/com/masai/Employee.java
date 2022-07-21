package com.masai;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {

        return getNetSalary();
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;


    }

    public Employee() {
    }

    private  double netSalary;
    public void calculateNetSalary(int pfPercentage){
        double k=(salary-(pfPercentage*100));
      //  netSalary=k;
        setNetSalary(k);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", netSalary=" + netSalary +
                '}';
    }
}
