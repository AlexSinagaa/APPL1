// ******************************************************
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
// ******************************************************

import java.util.Scanner;
public class Numbers
{
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println ("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();
        Sorting.insertionSort(intList);

        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println ();
    }
}

//salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//salesStaff[2] = new Salesperson("James", "Jones", 3000);
//salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
