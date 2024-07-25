package entities;

import interfaces.Check;

public class Volunteer implements Check {

    //    parametri
    private final String name;
    private final boolean cv;
    private final int age;
    private final double startOfService;

    //costruttore
    public Volunteer(String name, boolean cv, int age, double startOfService) {
        this.name = name;
        this.cv = cv;
        this.age = age;
        this.startOfService = startOfService;
    }

    //metodi
    //setter e getter

    public String getName() {
        return name;
    }

    public boolean getCv() {
        return cv;
    }

    public int getAge() {
        return age;
    }

    public double getStartOfService() {
        return startOfService;
    }

    @Override
    public void checkIn() {
        System.out.println("il volontario inizia a lavorare alle ore: " + this.startOfService);
    }
}
