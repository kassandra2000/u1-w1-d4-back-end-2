package entities;

import enums.Department;

public class Manager extends Employee {

    private final int overtime;
    private final double startOfService;


    public Manager(Department department, double salary, int overtime, double startOfService) {
        super(department, salary);
        this.overtime = overtime;
        this.startOfService = startOfService;
    }


    @Override
    public String calculateSalary() {
        return "il dirigente del reparto " + this.getDepartment() + " ha guadagnato: " + (this.getSalary() * 8 * 30 + this.getSalary() + overtime) + " €";
    }

    public double calculateOnlySalary() {
        return this.getSalary() * 8 * 30 + this.getSalary() + overtime;


    }

//    getter e setter


    public double getStartOfService() {
        return startOfService;
    }

    public int getOvertime() {
        return overtime;
    }

    @Override
    public void checkIn() {
        System.out.println("il manager del reparto: " + this.getDepartment() + " inizia a lavorare alle ore: " + this.startOfService);

    }
}
