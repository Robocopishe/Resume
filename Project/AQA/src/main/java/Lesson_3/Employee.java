package Lesson_3;

public class Employee {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final double  salary;
    private final int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println("---------------------");
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "892345678", 40000, 45);
        employees[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "892378901", 50000, 25);
        employees[3] = new Employee("Kuznetsov Alexey", "Team Lead", "kuznetsov@mailbox.com", "892301234", 60000, 42);
        employees[4] = new Employee("Smirnov Dmitry", "QA Engineer", "smirnov@mailbox.com", "892334567", 45000, 38);

        System.out.println("Employees older than 40:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printEmployeeInfo();
            }
        }
    }
}