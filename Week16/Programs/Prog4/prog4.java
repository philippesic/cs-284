package Prog4;

class Employee {

    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

}

class prog4 {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Jeremy", 20, "Sales");
        Employee emp2 = new Employee("Ben", 17, "Engineer", 90000);

        System.out.println(emp1.getSalary());
        System.out.println(emp2.getSalary());

        System.out.println("Philip Pesic 5/7/23");
    }
}
