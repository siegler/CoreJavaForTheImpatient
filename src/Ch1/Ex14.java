package Ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Write a program that reads a two-dimensional array of integers and determines whether it is a magic square (that is, whether the sum of all rows, all columns, and the diagonals is the same). Accept lines of input that you break up into individual integers, and stop when the user enters a blank line. For example, with the input
16 3 2 13
3 10 11 8
9 6 7 12
4 15 14 1
(Blank line)

your program should respond affirmatively.
 */
public class Ex14 {
    public static void main(String[] args) {
        List<Integer> square = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isMagicSquare = true;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner numberScanner = new Scanner(line);
            if (!numberScanner.hasNextInt()) break;

            while (numberScanner.hasNextInt()) {
                square.add(numberScanner.nextInt());
            }
        }

        int n = (int) Math.sqrt(square.size());

        int sumOfFirstRow = 0;
        for (int i = 0; i < n; i++) {
            sumOfFirstRow += square.get(i);
        }

        //check rows
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += square.get((i*n)+j);
            }
            if (sum != sumOfFirstRow) isMagicSquare = false;
        }

        //check columns
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j += 1) {
                sum += square.get(i+(j*n));
            }
            if (sum != sumOfFirstRow) isMagicSquare = false;
        }

        //check diagonals
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += square.get(i+(i*n));
        }
        if (sum != sumOfFirstRow) isMagicSquare = false;

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += square.get((n*i)+(n-i-1));
        }
        if (sum != sumOfFirstRow) isMagicSquare = false;

        System.out.println(isMagicSquare ? "Is magic square": "is NOT a magic square");
    }
}
