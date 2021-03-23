//**********************************************************
// CopyingaFile.java
//
// Copies a file to the standard output.
//**********************************************************
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class CopyingaFile{
    public static void main(String[] args){

        List<String> list=new ArrayList<String>();

        String nameoffile = null;
        Scanner fileScanner = null;
        Scanner scan = new Scanner(System.in);
        do{
            try{
                System.out.print("Enter a File Name: ");
                nameoffile = scan.next();
                list = Arrays.asList(nameoffile.split(" ",0)); // main list

                for (String listElement:list){
                    fileScanner = new Scanner(new File(listElement));
                    while (fileScanner.hasNextLine()){
//                        while(list != null) {
                        System.out.println(fileScanner.nextLine());
//                        }
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("File " + nameoffile + " does not exist, please try again.");
            }
        }
        while(fileScanner == null); //
    }
}

// split masukin ke list input