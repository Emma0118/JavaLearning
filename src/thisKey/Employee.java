package thisKey;

public class Employee {
    public static void main(String arg[]) {
        Employee2 employee2 = new Employee2(2);
        employee2.getInfo();
        Book2 booka = new Book2();
        System.out.println(booka);
        booka.print();
        System.out.println("-------------------");
        Book2 bookb = new Book2();
        System.out.println(booka);
        bookb.print();
    }
}

class Book2 {
    public void print() { //谁调用了print方法，this 就自动与此对象指向同一块内存，this 就是当前调用方法的对象 堆内存保存的内容
        System.out.println("this = " + this);
    }
}

class Employee2{
    private int number;
    private String name;
    private double salary;
    private String department;

    public Employee2() {
//        this.number = 0;
//        this.name = "";
//        this.salary = 0.0;
//        this.department = "未定";
        this(0,"无名氏",0.0,"未定");

    }
    public Employee2(int number) {
//        this();
//        this.name = "临时工";
//        this.salary = 800.0;
//        this.department = "后勤";
//        this.number = number;
        this(number,"临时工",800.0,"后勤部");
    }
    public Employee2(int number, String name) {
//        this(number);
//        this.salary = 2000.0;
//        this.department = "技术部";
//        this.name = name;
        this(number,name,800.0,"技术部");

    }
    public Employee2(int number, String name, double salary, String department) {
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // setter
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return this.number;
    }
    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }
    public String getDepartment() {
        return this.department;
    }
    public void getInfo() {
        System.out.println("编号: " + this.number + "; 姓名: " + this.name + "; "+ "工资: " + 800.0 + "; 部门:" + this.department);
    }
}
