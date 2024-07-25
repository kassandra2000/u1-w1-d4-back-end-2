package entities;

import enums.Department;
import interfaces.Check;

import java.util.Random;

public abstract class Employee implements Check {
    private final String serialNumber;
    private final double salary;
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private Department department;
    //costruttore

    public Employee(Department department, double salary) {

        this.serialNumber = serialNumber();
        this.department = department;
        this.salary = salary;
    }

    //metodi statici
    public static void printSerialNumber(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("la matricola del reparto " + employee.getDepartment() + " è: " + employee.getSerialNumber());
        }
    }

    public static void printMonthlySalary(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary());

        }
    }

    public static void printTotalSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.calculateOnlySalary();
        }
        System.out.println("la somma totale degli stipendi è: " + sum);
    }

    //metodi
    public String serialNumber() {
        Random r = new Random();
        String string = "";
        for (int i = 0; i < 9; i++) {
            string += str.charAt(r.nextInt(0, str.length()));
        }
        return string;
    }

    public abstract String calculateSalary();

    public abstract double calculateOnlySalary();
    //getter e setter

    public String getSerialNumber() {
        return serialNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
}
