package Ch1;
/*
Improve the average method so that it is called with at least one parameter.
 */
public class Ex16 {
    public static double average(double first, double... values) {
        double sum = first;
        for (double v: values) sum += v;
        return sum / values.length + 1;
    }

    public static void main(String[] args) {
        double result = average(3, 4.5, 10, 0);
        System.out.printf("%.2f", result);
    }
}
