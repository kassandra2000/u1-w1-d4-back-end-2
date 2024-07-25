package entities;

import enums.Department;

public class PartTimeEmployee extends Employee {
    private final int hoursWorked;
    private final int overtime;
    private final double startOfService;

    //costruttore
    public PartTimeEmployee(Department department, double salary, int hoursWorked, int overtime, double startOfService) {
        super(department, salary);
        this.hoursWorked = hoursWorked;
        this.overtime = overtime;
        this.startOfService = startOfService;
    }

    @Override
    public String calculateSalary() {
        return "il dipendente del reparto " + this.getDepartment() + " part-time ha guadagnato: " + (this.getSalary() * hoursWorked + this.getSalary() * overtime) + " €";
    }

    public double calculateOnlySalary() {
        return this.getSalary() * hoursWorked + this.getSalary() * overtime;

    }

    //getter e setter


    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getOvertime() {
        return overtime;
    }

    public double getStartOfService() {
        return startOfService;
    }

    @Override
    public void checkIn() {
        System.out.println("il dipendente part-time del reparto: " + this.getDepartment() + " inizia a lavorare alle ore: " + this.startOfService);

    }
}
