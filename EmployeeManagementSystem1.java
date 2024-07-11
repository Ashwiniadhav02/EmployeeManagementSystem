
import java.util.*;

interface Employee {
    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
    void setSalary(double salary);
    double getSalary();
}

class EmployeeImpl implements Employee {
    String name;
    int age;
    double salary;

    public void setName(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends EmployeeImpl {
}

class SalesPerson extends EmployeeImpl {
}

public class EmployeeManagementSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name for Employee:");
        String name = scanner.next();
        System.out.println("Enter age for Employee:");
        int age = scanner.nextInt();
        System.out.println("Enter salary for Employee:");
        double salary = scanner.nextDouble();
        Employee employee = new EmployeeImpl();
        employee.setName(name);
        employee.setAge(age);
        employee.setSalary(salary);
        System.out.println("Enter name for Manager:");
        name = scanner.next();
        System.out.println("Enter age for Manager:");
        age = scanner.nextInt();
        System.out.println("Enter salary for Manager:");
        salary = scanner.nextDouble();
        Employee manager = new Manager();
        manager.setName(name);
        manager.setAge(age);
        manager.setSalary(salary);
        System.out.println("Enter name for SalesPerson:");
        name = scanner.next();
        System.out.println("Enter age for SalesPerson:");
        age = scanner.nextInt();
        System.out.println("Enter salary for SalesPerson:");
        salary = scanner.nextDouble();
        Employee salesPerson = new SalesPerson();
        salesPerson.setName(name);
        salesPerson.setAge(age);
        salesPerson.setSalary(salary);
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee salary: " + employee.getSalary());
        System.out.println("Manager name: " + manager.getName());
        System.out.println("Manager age: " + manager.getAge());
        System.out.println("Manager salary: " + manager.getSalary());
        System.out.println("SalesPerson name: " + salesPerson.getName());
        System.out.println("SalesPerson age: " + salesPerson.getAge());
        System.out.println("SalesPerson salary: " + salesPerson.getSalary());
    }
}


