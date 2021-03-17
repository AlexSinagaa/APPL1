// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************
import java.util.Scanner;

public class WeeklySales
{
    public static void main(String[] args)
    {
        int order, size, sales = 0;
        String firstname, lastname;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many sales : ");
        size = scan.nextInt();

        Salesperson[] salesStaff = new Salesperson[size];

        for (order = 0; order < size; order++)
        {
            System.out.print("\nSales "+order+1);
            System.out.print("\n\tFirst Name \t: ");
            firstname = scan.next();
            System.out.print("\n\tLast Name \t: ");
            lastname = scan.next();
            System.out.print("\tTotal Sales \t: ");

            salesStaff[order] = new Salesperson(firstname, lastname, sales);
        }

        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
