package oop.cohesion;

public class CohesionExample {
}

// Class with High Cohesion
//This class has high cohesion because all of its methods and data are related to the single purpose of representing a car.
class Car {
    private String name;
    private int year;
    private int mileage;

    public Car(String name, int year, int mileage) {
        this.name = name;
        this.year = year;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }
}

// Class with Low Cohesion
//This class has low cohesion because its methods and data are related to multiple purposes. The calculateTaxes() method is related to the purpose of calculating taxes, while the printReport() method is related to the purpose of printing a report.
class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateTaxes() {
        // Calculate taxes for this employee
    }

    public void printReport() {
        // Print a report for this employee
    }
}
