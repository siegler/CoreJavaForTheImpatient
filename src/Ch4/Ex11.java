package Ch4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
Write the “Hello, World” program, using reflection to look up the out field of java.lang.System and using invoke to call the println method.
 */
public class Ex11 {
    public static void main(String[] args) {
        try {
            Field field = java.lang.System.class.getField("out");
            Object out = field.get(null); //static class
            Method print = out.getClass().getMethod("println", String.class);
            print.invoke(out, "Hello, world!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
