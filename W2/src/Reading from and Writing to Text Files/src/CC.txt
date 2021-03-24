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
        int creditHrs;      // number of semester hours earned
        double qualityPts;  // number of quality points earned
        double gpa;         // grade point (quality point) average
        String name;
        String inputName = "students.txt"; // can be like ==> D:\Z - Main\4 - Semester\4 - Analasis dan Perancangan Perangkat Lunak 1\PR\GitHub\W2\src\Reading from and Writing to Text Files\src\students.dat
        String outputName = "warning.txt"; // can be like ==> D:\Z - Main\4 - Semester\4 - Analasis dan Perancangan Perangkat Lunak 1\PR\GitHub\W2\src\Reading from and Writing to Text Files\src\warning.dat
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
//        Scanner inFile = null;
//        PrintWriter outFile = null;
        try{
            // Set up scanner to input file
            Scanner scan = new Scanner(new File(inputName));
            // Set up the output file stream
            PrintWriter outFile = new PrintWriter(outputName);
            // Print a header to the output file
            outFile.println ("Students on Academic Warning\n");
            // Process the input file, one token at a time
            while (scan.hasNextLine()){
//                line = inFile.nextLine();
//                inFile = new Scanner(line);
//                name = inFile.next();
//                creditHrs = inFile.nextInt();
//                qualityPts = inFile.nextDouble();
                String[] input = scan.nextLine().split(" ",0);
                // Get the credit hours and quality points and
                name = input[0];
                creditHrs = Integer.parseInt(input[1]);
                qualityPts = Double.parseDouble(input[2]);
                // determine if the student is on warning. If so,
                // write the student data to the output file.
                gpa = qualityPts / creditHrs;
                if((gpa < 1.5 && creditHrs < 30) || (gpa < 1.75 && creditHrs < 60) || (gpa < 2.0) && creditHrs > 60){
                    outFile.write(name + " " + creditHrs + " " + decimalFormat.format(gpa) + "\n");
                }
            }
            // Close output file
            outFile.close();
            System.out.println("Written file successful");
        }catch (FileNotFoundException exception){
            System.out.println ("The file " + inputName + " was not found.");
        }catch (NumberFormatException exception){
            System.out.println ("Format error in input file: " + exception);
        }
    }
}