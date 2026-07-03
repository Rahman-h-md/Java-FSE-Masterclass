package employee;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        // Add Employees
        management.addEmployee(new Employee(101, "Rahman", "Software Engineer", 65000));
        management.addEmployee(new Employee(102, "Aman", "Data Analyst", 55000));
        management.addEmployee(new Employee(103, "Priya", "HR Manager", 60000));
        management.addEmployee(new Employee(104, "Rohit", "Tester", 45000));

        System.out.println("\n===== All Employees =====");
        management.displayAllEmployees();

        System.out.println("\n===== Search Employee =====");

        Employee emp = management.searchEmployee(102);

        if (emp != null) {
            emp.displayEmployee();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\n===== Delete Employee =====");

        management.deleteEmployee(103);

        System.out.println("\n===== Employees After Deletion =====");

        management.displayAllEmployees();
    }
}