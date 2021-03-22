// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************
import java.util.Scanner;

public class Factorials{
    public static void main(String[] args){
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")){
            System.out.print("Enter an integer: ");
            try{
                int val = scan.nextInt();
                if (val<0){
                    throw new IllegalArgumentException("Bilangan negatif dilarang\n");
                }
                else if (val>16){
                    throw new IllegalArgumentException("Bilangan lebih besar dari 16\n");
                }
                System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
            } catch (IllegalArgumentException e){
                System.out.print(e);
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}