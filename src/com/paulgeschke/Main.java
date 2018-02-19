package com.paulgeschke;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.createEmployee("Riley Sadler", "555 555-5555", 1);
        e1.displayEmployee();
        e2.createEmployee("Sindy Cobb", "555 555-6666", 2);
        e2.displayEmployee();
        e3.createEmployee("Amias Bone", "555 555-7777", 3);
        e3.displayEmployee();
    }
}

class Employee {
    private String employeeName;
    private String employeeNumber;
    private int employeeShift;


    private String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public int getEmployeeShift() {
        return employeeShift;
    }

    private void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    private void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public void createEmployee(String name, String number, int shift){
        this.setEmployeeName(name);
        this.setEmployeeNumber(number);
        this.setEmployeeShift(shift);
    }

    public void displayEmployee(){
        System.out.println("Employee Information");
        System.out.println("Employee Name: " + this.getEmployeeName());
        System.out.println("Employee Number: " + this.getEmployeeNumber());
        System.out.println("Employee Shift: " + this.getEmployeeShift());
        System.out.println("");
    }

}