import java.util.Scanner;
import java.math.*;

public class ThreeIntegers {
    public static void main(String [] args) {
        int a,b,c;
        Scanner input1 = new Scanner(System.in);
        //Create for first input
        System.out.println("Input the first integer:");
        //input validation with exception handling for input mismatch
        //It ensures that the user inputs an Integer before moving on. Catches error before it happens.
        while (!input1.hasNextInt()) {
            System.out.println("Incorrect, Please input a whole number!: ");
            input1.next(); // this is important!
        }
        a = input1.nextInt();
        //Create for second input

        Scanner input2 = new Scanner(System.in);
        System.out.println("Input the second integer:");
        //input validation with exception handling
        while (!input1.hasNextInt()) {
            System.out.println("Incorrect, Please input a whole number!: ");
            input1.next(); // this is important!
        }
        b = input1.nextInt();
        //Create for third input

        Scanner input3 = new Scanner(System.in);
        System.out.println("Input the third integer:");
        while (!input1.hasNextInt()) {
            System.out.println("Incorrect, Please input a whole number!: ");
            input1.next(); // this is important!
        }
        c = input1.nextInt();
        //input validation with exception handling

        int the_sum = a+b+c;
        int the_average = (a+b+c)/3;
        int the_product = a*b*c;
        int the_smallest = Math.min(Math.min(a,b),c);
        int the_largest = Math.max(Math.max(a,b),c);

        System.out.println("The sum of three integers is: " + the_sum);
        System.out.println("The average of three integers is: " + the_average);
        System.out.println("The product of three integers is: " + the_product);
        System.out.println("The smallest of the three integers is: " + the_smallest);
        System.out.println("The largest of the three integers is: " + the_largest);

    }
}
