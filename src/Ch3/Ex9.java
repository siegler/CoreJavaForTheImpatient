package Ch3;

/*
Implement methods:
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)

The first method should run each task in a separate thread and then return. The second method should run all methods in
the current thread and return when the last one has completed.
 */
public class Ex9 {
    class HelloTask implements Runnable {
        String name;
        HelloTask(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println("Hello, " + name);
        }
    }
    public static void runTogether(Runnable... tasks) {
        for (Runnable task: tasks) {
            new Thread(task).start();
        }
    }
    public static void runInOrder(Runnable... tasks) {
        for (Runnable task: tasks) {
            task.run();
        }
    }
    public static void main(String[] args) {
        HelloTask moe = new Ex9().new HelloTask("Moe");
        HelloTask curly = new Ex9().new HelloTask("Curly");
        HelloTask larry = new Ex9().new HelloTask("Larry");
        runTogether(moe,curly,larry);
        runInOrder(moe,curly,larry);
    }
}
