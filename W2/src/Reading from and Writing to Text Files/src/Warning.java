// ****************************************************************************
// Warning.java
//
// Reads student data from a text file and writes data to another text file.
// ****************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
public class Warning{
    // --------------------------------------------------------------------
    // Reads student data (name, semester hours, quality points) from a
    // text file, computes the GPA, then writes data to another file
    // if the student is placed on academic warning.
    // --------------------------------------------------------------------
    public static void main (String[] args){
        String name;
        int creditHrs;      // number of semester hours earned
        double qualityPts;  // number of quality points earned
        double gpa;         // grade point (quality point) average
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String inputName = "students.txt"; // can be like ==> D:\Z - Main\4 - Semester\4 - Analasis dan Perancangan Perangkat Lunak 1\PR\GitHub\W2\src\Reading from and Writing to Text Files\src\students.dat
        String outputName = "warning.txt"; // can be like ==> D:\Z - Main\4 - Semester\4 - Analasis dan Perancangan Perangkat Lunak 1\PR\GitHub\W2\src\Reading from and Writing to Text Files\src\warning.dat
        Scanner inFile = null;
        PrintWriter outFile = null;
        try{
            // Set up scanner to input file
            inFile = new Scanner(new File(inputName));
            // Set up the output file stream
            outFile = new PrintWriter(new FileWriter(outputName));
            // Print a header to the output file
            outFile.println ("Students on Academic Warning");
            // Process the input file, one token at a time
            while (inFile.hasNext()){
//                line = inFile.nextLine();
//                inFile = new Scanner(line);
//                name = inFile.next();
//                creditHrs = inFile.nextInt();
//                qualityPts = inFile.nextDouble();
                String[] input = inFile.nextLine().split(" ",0);
                // Get the credit hours and quality points and
                name = input[0];
                creditHrs = Integer.parseInt(input[1]);
                qualityPts = Double.parseDouble(input[2]);
                // determine if the student is on warning. If so,
                // write the student data to the output file.
                gpa = qualityPts/creditHrs;
                if((gpa < 1.5 && creditHrs < 30) || (gpa < 1.75 && creditHrs < 60) || (gpa < 2.0)){
                    outFile.write(name + " " + creditHrs + " " + decimalFormat.format(gpa) + "\n");
                }
            }
            // Close output file
            outFile.close();
            System.out.println("Written file successful");
        }catch (FileNotFoundException e){
            System.out.println ("The file " + inputName + " was not found.");
        }catch (IOException e){
            System.out.println ("Wrong input/output stream");
        }catch (NumberFormatException e){
            System.out.println ("Format error in input file: ");
            System.out.println ("Format/spec must be"
                    + "contain the student name (a single String  with no spaces), "
                    + "\nthe number of semester hours earned (an integer), the total quality "
                    + "points earned (a double). \nExample ==> Smith 27 83.7");
        }
    }
}