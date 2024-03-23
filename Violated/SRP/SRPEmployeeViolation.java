class Employee {
    private String name;
    private int age;
    privaet String department;

    public void printEmployeeDetails() {
        System.out.printIn("Name:" + name);
        System.out.printIn("Age:" + age);
        System.out.printIn("Department:" + department);
    }
}

// The employee class violates SRP by handing both the management of employee data (properties, getters, setters, etc
// and the printing of employee details within the same class. This makes the class less cohesive and harder to maintain.
