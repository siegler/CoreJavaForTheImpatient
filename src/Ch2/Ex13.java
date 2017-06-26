package Ch2;

import com.opencsv.CSVReader;

import java.io.FileReader;
/*
Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write a class with a main method that reads a CSV file of your choice and prints some of the content. There is sample code on the OpenCSV web site. You haven’t yet learned to deal with exceptions. Just use the following header for the main method:
Click here to view code image
public static void main(String[] args) throws Exception

The point of this exercise is not to do anything useful with CSV files, but to practice using a library that is delivered as a JAR file.
 */
public class Ex13 {
    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            //print out players names from first column
            System.out.println(nextLine[0]);
        }
    }
}
