import java.util.ArrayList;
import java.util.List;

public class Employee {
    public static void main(String[] args){
    String firstName;
    String lastName;
    String department;


    public Employee(String firstName, String lastName, String department) {
        firstName = firstName;
        lastName = lastName;
        department = department;
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
    public void setLastName(String lastName){
            this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
        ArrayList<Employee> Employee = new ArrayList<Employee>();

        firstName.add("Harold");
        firstName.add("Luciano");
        firstName.add("Tyree");
        firstName.add("Nyla");
        firstName.add("Natalie");
        firstName.add("Quincy");
        firstName.add("Devyn");
        firstName.add("Aliana");

        lastName.add("Riddle");
        lastName.add("Zavala");
        lastName.add("Ho");
        lastName.add("Saunders");
        lastName.add("Morgan");
        lastName.add("Schroeder");
        lastName.add("Nolan");
        lastName.add("Orr");

        department.add("production");
        department.add("r&d");
        department.add("sales");
        department.add("marketing");
        department.add("human resources");
        department.add("accounting");
        department.add("sales");
        department.add("r&d");

        System.out.println(Employee);

    }//main

}//class


