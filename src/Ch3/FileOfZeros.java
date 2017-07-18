package Ch3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOfZeros {
    public static void main(String[] args) {
        BufferedWriter output = null;
        try {
            File f = new File("/home/chris/Documents/zeros.txt");
            output = new BufferedWriter(new FileWriter(f));
            for (int i = 0; i < 1e6; i++) {
                output.write("0");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                output.close();
            } catch (IOException e) {
                //ignore
            }
        }
    }
}
