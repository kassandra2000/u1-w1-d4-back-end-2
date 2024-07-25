package entities;

import enums.Department;
import interfaces.Check;

public class Main {
    public static void main(String[] args) {

//       esercizio 1
//        Employee employee = new Employee(Department.AMMINISTRAZIONE, 2500.00);
//        Employee employee1 = new Employee(Department.VENDITE, 1500.00);
//        Employee employee2 = new Employee(Department.PRODUZIONE, 1200.00);
//        Employee[] employees = new Employee[]{employee, employee1, employee2};
//        Employee.printSerialNumber(employees);

//       esercizio 2
        System.out.println("------------esercizio 2----------------");
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(Department.PRODUZIONE, 1200.00, 32, 7, 5.30);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(Department.VENDITE, 9.00, 94, 7, 9.00);
        Manager manager = new Manager(Department.AMMINISTRAZIONE, 15.00, 9, 7.30);
        Employee[] employees = new Employee[]{fullTimeEmployee, partTimeEmployee, manager};
        Employee.printMonthlySalary(employees);
        Employee.printTotalSalary(employees);
        // esercizio 3
        System.out.println("------------esercizio 3----------------");
        Volunteer volunteer = new Volunteer("Mario", true, 38, 8.00);
        Check[] employeesAndVolunteers = new Check[]{fullTimeEmployee, partTimeEmployee, manager, volunteer};

        printCheckIn(employeesAndVolunteers);
        
        System.out.println("------------esercizio extra----------------");
        Employee.printSerialNumber(employees);


    }

    public static void printCheckIn(Check[] employeesAndVolunteers) {
        for (Check employeesAndVolunteer : employeesAndVolunteers) {
            employeesAndVolunteer.checkIn();
        }
    }
}