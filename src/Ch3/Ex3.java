package Ch3;
/*
What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note that each type is its own supertype. A
class or interface without declared supertype has supertype Object.
 */
public class Ex3 {
    public static void main(String[] args) {
        /* Supertypes of String are Serializable, Comparable<String>, and CharSequence */
        /* Supertypes of Scanner are Closeable, AutoCloseable, Iterator<String> */
        /* Supertypes of ImageOutputStream are AutoCloseable, Closeable, DataInput, DataOutput, ImageInputStream */
    }
}
