package Ch2;

/**
 * Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of miles, to add a given number of gallons to the gas tank, and to get the current distance from the origin and fuel level. Specify the fuel efficiency (in miles/gallons) in the constructor. Should this be an immutable class? Why or why not?
 */
public class Ex9 {
    public class Car {
        private double mpg;
        private double odometer;
        private double gasTank;

        Car(double odometer, double gasTank, double mpg) {
            this.odometer = odometer;
            this.gasTank = gasTank;
            this.mpg = mpg;
        }
        Car(double mpg) {
            this(0,0,mpg);
        }
        public void drive(double miles) {
            double gasNeeded = miles / mpg;
            if (gasNeeded > gasTank) {
                miles = mpg * gasTank;
            }
            odometer += miles;
            gasTank -= miles / mpg;
        }
        public void addGas(double gallons) {
            gasTank += gallons;
        }
        public double disanceFromOrigin() {
            return odometer;
        }
    }
    public static void main(String[] args) {
        Car chevy = new Ex9().new Car(25.0);
        chevy.addGas(10);
        chevy.drive(300);
        System.out.println(chevy.disanceFromOrigin());
    }
}
