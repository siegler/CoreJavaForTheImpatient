package Ch4;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
Write the “Hello, World” program, using reflection to look up the out field of java.lang.System and using invoke to call the println method.
 */
public class Ex11 {
    public static void main(String[] args) {
        try {
            Field out = java.lang.System.class.getField("out");
            System.out.println(out);
            Method print = out.getClass().getMethod("println", String.class);
            Method m = java.io.PrintStream.class.getMethod("println", String.class);
            System.out.println(m);
            PrintStream ps = new PrintStream(System.out);
//            m.invoke(ps, "Hello, World!");
            print.invoke(ps, "Hello, world!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
