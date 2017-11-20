package Ch1;

/*
 Section 1.5.3, “String Comparison,” on p. 21 has an example of two strings s and t so that s.equals(t) but s != t. Come
 up with a different example that doesn’t use substring)
 */
public class Ex9 {
    public static void main(String[] args) {
        String s = "Chris";
        String t = new StringBuffer("sirhC").reverse().toString();

        System.out.println(s.equals(t));
        System.out.println(s == t);
    }
}
