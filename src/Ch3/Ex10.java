package Ch3;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
/*
Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class, write a method that returns all subdirectories of a given directory. Use a lambda expression instead of a FileFilter object. Repeat with a method expression and an anonymous inner class.
 */
public class Ex10 {
    public static File[] getDirectories(File file, FileFilter filter) {
        ArrayList<File> files = new ArrayList<>();
        for (File f: file.listFiles(filter)) {
            if (f.isDirectory()) {
                files.add(f);
                getDirectories(f, filter);
            }
        }

        File[] result = new File[files.size()];
        result = files.toArray(result);
        return result;
    }

    public static void main(String[] args) {
        File file = new File(".");

        getDirectories(file, (path) -> path.isDirectory());
        getDirectories(file, File::isDirectory);
        getDirectories(file, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }
}
