package Ch3;
/*
Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee
implement Measurable. Provide a method double average(Measurable[] objects) that computes the average measure. Use it to
compute the average salary of an array of employees.
 */
public class Ex1 {
    public static double average(Measurable[] objects) {
        double sum = 0.0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }

    public static void main(String[] args) {
        Employee[] google = {
                new Employee("Larry",25000),
                new Employee("Moe", 16000),
                new Employee("Curly", 22000)
        };
        System.out.println(average(google));
    }
}
