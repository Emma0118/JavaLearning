import com.horstman.corejava.*;
// the Employee4 class is defined in that package
import static java.lang.System.*;
/**
 * This program demonstrates the use of packages
 * @version 1.11 2017-10-19
 * @author Emma
 * */
public class PackageTest {
    public static void main(String[] args) {
        //because of the import statement, we don't have to use com.horstman.corejava.Employee4 here
        Employee4 harry = new Employee4("Harry Hacker", 50000, 1989,10,1);
        harry.raiseSalary(5);

        // because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + ", salary=" + harry.getSalary());
    }
}
