package arrayList;

import java.io.PrintStream;

class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee (String var1, double var2, int year, int month, int day) {
        this.name = var1;
        this.salary = var2;
        this.id = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId() {
        this.id = nextId++;
    }

    public static int getNextId() {
        return nextId;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
