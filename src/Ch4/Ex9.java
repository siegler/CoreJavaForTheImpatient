package Ch4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
Write a “universal” toString method that uses reflection to yield a string with all instance variables of an object. Extra credit if you can handle cyclic references.
 */
class Foo {
    private String s;
    protected int i;
    public boolean b;
    static int staticInt = 44;

    Foo(String s, int i, boolean b) {
        this.s = s;
        this.i = i;
        this.b = b;
    }
}
public class Ex9 {
    public static String toString(Object obj) {
        StringBuffer sb = new StringBuffer();
        String newline = "";
        for (Field f: obj.getClass().getDeclaredFields()) {
            int mod = f.getModifiers();
            if (Modifier.isStatic(mod)) {
                continue;
            }
            f.setAccessible(true);
            try {
                Object value = f.get(obj);
                sb.append(newline + Modifier.toString(mod) + " " + f.getType().getSimpleName() + " " + f.getName() + ":" + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            newline = "\n";
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Foo foo = new Foo("Moe", 99, false);
        System.out.println(toString(foo));
    }
}
