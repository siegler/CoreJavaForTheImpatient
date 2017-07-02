package Ch3;
/*
Implement a class Greeter that implements Runnable and whose run method prints n copies of "Hello, " + target, where n and target are set in the constructor. Construct two instances with different messages and execute them concurrently in two threads.
 */
public class Ex8 {
    public class Greeter implements Runnable {
        private String target;
        private int n;
        Greeter(String s, int n) {
            target = s;
            this.n = n;
        }
        @Override
        public void run() {
            for (int i = 0; i < n; i++) {
                System.out.println("Hello, " + target);
            }
        }
    }

    public static void main(String[] args) {
        Greeter moe = new Ex8().new Greeter("Moe",10);
        Greeter curly = new Ex8().new Greeter("Curly",10);
        new Thread(moe).run();
        new Thread(curly).run();
    }
}
