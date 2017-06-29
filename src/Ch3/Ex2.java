package Ch3;
/*
Continue with the preceding exercise and provide a method Measurable largest(Measurable[] objects). Use it to find the name of the employee with the largest salary. Why do you need a cast?
 */
public class Ex2 {
    public static Measurable largest(Measurable[] objects) {
        if (objects == null) {
            return null;
        }
        Measurable result = objects[0];
        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasure() > result.getMeasure()) {
                result = objects[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Employee[] google = {
                new Employee("Larry",25000),
                new Employee("Moe", 16000),
                new Employee("Curly", 22000)
        };
        /* We need a cast because Measurable objects don't have a getName() method */
        Employee highestPaid = (Employee)largest(google);
        System.out.println(highestPaid.getName());
    }
}
