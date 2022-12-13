
import java.util.ArrayList;

public class Employee {

    private static String firstName;
    private static String lastName;
    private static String department;

    public static void main(String[] args) {

        System.out.println("hello universe!");

        String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla",
                "Natalie", "Quincy", "Devyn", "Aliana"};

        String[] lastName = {"Riddle", "Zavala", "Ho", "Saunders",
                "Morgan", "Schroeder", "Nolan", "Orr"};

        String[] department = {"production", "r&d", "sales",
                "marketing", "human resources", "accounting", "sales",
                "r&d"};

        ArrayList<Employee> listOfEmployees = addEmployees(firstName, lastName, department);
    }

    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public static ArrayList<Employee> addEmployees(String[] first, String[] last, String[] department) {

        ArrayList<Employee> employees = new ArrayList<>();

        Integer numberOfEmployeesToLoad = first.length; //8

        for (int employeeLoadIterationCounter = 0; employeeLoadIterationCounter < numberOfEmployeesToLoad; employeeLoadIterationCounter++) {

            Employee newEmployeeLoadedFromArrays = new Employee(
                    first[employeeLoadIterationCounter],
                    last[employeeLoadIterationCounter],
                    department[employeeLoadIterationCounter]
            );

            System.out.println("The Loaded Employee: " + newEmployeeLoadedFromArrays);

            employees.add(newEmployeeLoadedFromArrays);

        }

        System.out.println("The List of Employees:");
        System.out.println(employees);

        return employees;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", department='" + department + '\''
                + '}';
    }

}
