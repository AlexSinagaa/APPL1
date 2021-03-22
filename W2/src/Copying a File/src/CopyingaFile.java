//**********************************************************
// CopyingaFile.java
//
// Copies a file to the standard output.
//**********************************************************

import java.util.Scanner;

import java.io.*;

public class CopyingaFile{
    public static void main(String[] args)    {
        String nameoffile = null;
        Scanner fileScanner = null;
        Scanner scan = new Scanner(System.in);

        do{
            try{
                System.out.print("Enter a nameoffile: ");
                nameoffile = scan.next();
                fileScanner = new Scanner(new File(nameoffile));
            }catch(FileNotFoundException e){
                System.out.println("File " + nameoffile + " does not exist, please try again.");
            }
        }
        while(fileScanner == null);
        while (fileScanner.hasNext())
        {
            System.out.println(fileScanner.nextLine());
        }
    }
}