public class StaticTest {
    public static void main(String[] args)
    {
        EmployeeTest[] staff = new EmployeeTest[3];
        staff[0] = new EmployeeTest("Tom", 40000);
        staff[1] = new EmployeeTest("Dick", 50000);
        staff[2] = new EmployeeTest("Harry", 60000);

        for(EmployeeTest e : staff) {
            e.setId();
            System.out.println("name = " + e.getName() + ", id = "+ e.getId() + ", salary = " + e.getSalary());
        }

        int n = EmployeeTest.getNextId(); //calls static method
        System.out.println("Next available id = " + n);
    }
}

class EmployeeTest {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public EmployeeTest(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setId() {
        id = nextId;
        nextId++;
    }
    public static int getNextId() {
        return nextId;
    }
    public static void main(String[] args) { //unit test
        EmployeeTest e = new EmployeeTest("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
