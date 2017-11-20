package Ch3;

/*
Write a method that takes an array of Runnable instances and returns a Runnable whose run method executes them in order.
Return a lambda expression.
 */
public class Ex13 {
    public static Runnable runInOrder(Runnable[] tasks) {
        return () -> { for (Runnable task: tasks) { task.run(); } };
    }
    public static void main(String[] args) {
        Runnable shemp = () -> System.out.println("Why don't I come up and see ya sometime when you're in the nude... I mean mood.");
        Runnable moe = () -> System.out.println("I got a tapeworm and that's good enough for him!");
        Runnable curly = () -> System.out.println("Burnt toast and a rotten egg? Whatta ya want that for?");
        Runnable[] tasks = { curly, moe, shemp };

        Runnable task = runInOrder(tasks);
        task.run();
    }
}
