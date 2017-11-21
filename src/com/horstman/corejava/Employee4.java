package com.horstman.corejava;
// the Classes in this file are part of this package

import java.util.*;
// import statements come after the package statement
/**
 * @version 1.10 2017-10-19
 * @author Emma
 * */
public class Employee4 {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee4(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        //GregorianCalendar uses 0 for January
        hireDay = calendar.getTime();
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
    public void raiseSalary(double byPercent) {
        double raise  = salary * byPercent / 100;
        salary += raise;
    }
}
