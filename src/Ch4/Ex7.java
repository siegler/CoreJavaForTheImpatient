package Ch4;
enum Colors {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

    public static Colors getRed() { return RED; }
    public static Colors getBlue() { return BLUE; }
    public static Colors getGreen() { return GREEN; }
}
public class Ex7 {
    public static void main(String[] args) {
        Colors red = Colors.getRed();
        System.out.println(red);
    }
}
