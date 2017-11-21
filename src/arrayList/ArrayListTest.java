package arrayList;

import java.util.*;
/**
 * This program demonstrates the ArrayList class
 * @version 1.11 2017-10-26
 * @author Emma
 * */
public class ArrayListTest {
    public static void main(String[] args) {
        //fill the staff array list with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987,12,15));

        //raise everyone's salary by 5%
        for(Employee e:staff) {
            e.raiseSalary(5);
        }
        for(Employee e : staff) {
            System.out.println("name=" + e.getName()+", salary=" + e.getSalary());
        }

        System.out.println(staff.size());
    }
}
