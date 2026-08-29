import com.rohith.assignment.employees.Developer;
import com.rohith.assignment.employees.Manager;
import com.rohith.assignment.utilities.Utilities;

public class Assignment{

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Rahul",
                101,
                60000,
                5
        );

        Developer developer = new Developer(
                "Rohith",
                102,
                50000,
                "Java"
        );

        Utilities utilities = new Utilities();

        System.out.println("===== MANAGER DETAILS =====");
        utilities.displayManager(manager);

        System.out.println();

        System.out.println("===== DEVELOPER DETAILS =====");
        utilities.displayDeveloper(developer);

        System.out.println();

        System.out.println("===== SALARY UPDATE =====");
        utilities.increaseSalary(manager, 10);
        utilities.increaseSalary(developer, 10);
    }
}