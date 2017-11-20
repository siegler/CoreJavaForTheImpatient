package Ch3;

import java.util.Arrays;
import java.util.Comparator;

/*
Write a call to Arrays.sort that sorts employees by salary, breaking ties by name. Use Comparator.thenComparing. Then do
this in reverse order.
 */
public class Ex14 {
    public static void main(String[] args) {
        Employee moe = new Employee("Moe", 9000);
        Employee shemp = new Employee("Shemp", 7000);
        Employee curly = new Employee("Curly", 7000);
        Employee[] stooges = { moe, curly, shemp };
        Arrays.sort(stooges, Comparator
                .comparing(Employee::getMeasure)
                .thenComparing(Employee::getName)
                .reversed());
        for (Employee stooge: stooges) {
            System.out.println(stooge.getName());
        }
    }
}
