package Ch3;

public class Employee implements Measurable {
    private double salary;
    private String name;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
