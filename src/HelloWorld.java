import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        new Test();
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987,12,15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989,10,1);
        staff[2] = new Employee("Tony Tester", 40000, 1990,3,15);
        System.out.println(Employee.emma);
        for(Employee  e : staff) {
            e.raiseSalary(5);
            e.setId();
        }

        for(Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay = " + e.getHireDay() + ", id = " + e.getId());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private Date hireDay;
    private static int nextId = 1; //这个类的所有实例共享一个nextId;
    private int id;
    public static final int emma = 2;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
//        System.out.println("I am Emma!");
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public Date getHireDay() {
        return hireDay;
    }
    public int getId() {
        return id;
    }
    public void setId() {
        id = nextId;
        nextId++;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

