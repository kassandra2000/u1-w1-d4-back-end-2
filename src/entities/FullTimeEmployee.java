package entities;

import enums.Department;

public class FullTimeEmployee extends Employee {

    private final int overtime;
    private final int salaryForOvertime;
    private final double startOfService;


    //costruttore
    public FullTimeEmployee(Department department, double salary, int overtime, int salaryForOvertime, double startOfService) {
        super(department, salary);
        this.overtime = overtime;
        this.salaryForOvertime = salaryForOvertime;
        this.startOfService = startOfService;
    }

    @Override
    public String calculateSalary() {
        return "il dipendente del reparto " + this.getDepartment() + " full time ha guadagnato: " + (this.getSalary() + this.salaryForOvertime * overtime) + " €";

    }

    public double calculateOnlySalary() {
        return (this.getSalary() + this.salaryForOvertime * overtime);

    }

    //getter e setter

    public int getOvertime() {
        return overtime;
    }

    public int getSalaryForOvertime() {
        return salaryForOvertime;
    }

    public double getStartOfService() {
        return startOfService;
    }

    @Override
    public void checkIn() {
        System.out.println("il dipendente full time del reparto: " + this.getDepartment() + " inizia a lavorare alle ore: " + this.startOfService);
    }
}
