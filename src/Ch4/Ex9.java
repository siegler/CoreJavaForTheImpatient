package Ch4;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Foo {
    private String s;
    protected int i;
    public boolean b;
    static int staticInt;

    Foo(String s, int i, boolean b) {
        this.s = s;
        this.i = i;
        this.b = b;
    }
}
public class Ex9 {
    public static String toString(Object obj) {
        StringBuffer sb = new StringBuffer();

        for (Field f: obj.getClass().getDeclaredFields()) {
            int mod = f.getModifiers();
            if (Modifier.isStatic(mod)) {
                continue;
            }
            f.setAccessible(true);
            try {
                Object value = f.get(obj);
                sb.append(Modifier.toString(mod) + " " + f.getType().getSimpleName() + " " + f.getName() + ":" + value + "\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Foo foo = new Foo("Moe", 99, false);
        System.out.println(toString(foo));
    }
}
