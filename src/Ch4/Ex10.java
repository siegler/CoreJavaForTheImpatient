package Ch4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
/*
Use the MethodPrinter program in Section 4.5.1, “Enumerating Class Members,” on p. 160 to enumerate all methods of the
int[] class. Extra credit if you can identify the one method (discussed in this chapter) that is wrongly described.
 */
public class Ex10 {
    public static void methodPrinter(Object obj) {
        Class<?> cl = obj.getClass();
        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getCanonicalName() + " " +
                                m.getName() +
                                Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[1];
        methodPrinter(intArray);
    }
}
