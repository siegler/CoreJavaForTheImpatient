package Ch8;
/*
Use the String.codePoints method to implement a method that tests whether a string is a word, consisting only of
letters. (Hint: Character.isAlphabetic.) Using the same approach, implement a method that tests whether a string is a
valid Java identifier.
 */
public class Ex6 {
    public static boolean isWord(String s) {
        return s.codePoints().allMatch(c -> Character.isAlphabetic(c));
    }
    public static boolean isJavaIdentifier(String s) {
        if (!Character.isJavaIdentifierStart(s.codePointAt(0)))
            return false;
        return s.substring(1).codePoints().allMatch(c -> Character.isJavaIdentifierPart(c));
    }
    public static void main(String[] args) {
        System.out.println(isWord("fish"));
        System.out.println(isWord("2fish"));
        System.out.println(isJavaIdentifier("2fish"));
        System.out.println(isJavaIdentifier("_Fi$h"));
    }
}
