import java.util.*;
public class AttendanceSystem {
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nEmployee Attendance System");
            System.out.println("1. Add Employee");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Find Absentees");
            System.out.println("4. Sort by Attendance");
            System.out.println("5. Top Attendance Employee");
            System.out.println("6. Display All Employees");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: addEmployee(); break;
                case 2: markAttendance(); break;
                case 3: findAbsentees(); break;
                case 4: sortByAttendance(); break;
                case 5: topAttendanceEmployee(); break;
                case 6: displayAll(); break;
                case 7: System.out.println("Exiting Program"); break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 7);
    }
    public static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Employee emp = new Employee(id, name, dept);
        employees.add(emp);

        System.out.println("Employee Added Successfully!");
    }
    public static void markAttendance() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.employeeId == id) {
                System.out.print("Enter Attendance Percentage: ");
                double attendance = sc.nextDouble();
                emp.attendancePercentage = attendance;
                System.out.println("Attendance Updated!");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Employee Not Found!");
    }
   
    public static void findAbsentees() {

        System.out.println("Absentee Employees");

        boolean found = false;

        for (Employee emp : employees) {
           
            if (emp.attendancePercentage == 0) {
                emp.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Absentees Found!");
        }
    }
    public static void sortByAttendance() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.attendancePercentage, e1.attendancePercentage);
            }
        });
        System.out.println("\nEmployees Sorted by Attendance");
        for (Employee emp : employees) {
            emp.display();
        }
    }
    public static void topAttendanceEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Available!");
            return;
        }
        Employee top = Collections.max(employees, Comparator.comparingDouble(e -> e.attendancePercentage));
        System.out.println("\nTop Attendance Employee");
        top.display();
    }
    public static void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No Employees Found!");
            return;
        }
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
class Employee {
    int employeeId;
    String employeeName;
    String department;
    double attendancePercentage;
    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.attendancePercentage = 0.0;
    }
    public void display() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + employeeName);
        System.out.println("Department  : " + department);
        System.out.println("Attendance  : " + attendancePercentage + "%");
    }
}
