package entities;

import enums.Department;
import interfaces.Check;

import java.util.Random;

public abstract class Employee implements Check {
    private final int serialNumber;
    private final double salary;
    private Department department;

    //costruttore

    public Employee(Department department, double salary) {
        Random r = new Random();
        this.serialNumber = r.nextInt(11111, 999999);
        this.department = department;
        this.salary = salary;
    }

    public static void printSerialNumber(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("la matricola del reparto: " + employee.getDepartment() + " è: " + employee.getSerialNumber());
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
    //metodi statici

    //metodi
    public abstract String calculateSalary();

    public abstract double calculateOnlySalary();
    //getter e setter

    public int getSerialNumber() {
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
