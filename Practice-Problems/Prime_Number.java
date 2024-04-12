    // Program to check whether a number is prime or not.
    // A prime number is a number that is greater than 1 and divided by 1 or itself only.
    // Example of prime numbers: 2, 3, 5, 7, 11, 13, 17, etc.
    
import java.util.*;
public class Prime_Number {
    public static void Prime(int num) {
        if (num <= 1) { // 0 and 1 are not prime numbers
            System.out.println("The "+num+" is 2not Prime number.");
            return; // return will stop the execution of the method
        }
        for (int i = 2; i < num; i++) {     //
            if (num % i == 0) { 
                System.out.println("The "+num+" is not Prime number.");
                return;
            }
        }
        System.out.println("The "+num+" is Prime number.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter a number to check whether it's prime or not: ");
            int number = sc.nextInt();
            Prime(number);
            System.out.println("Do you want to continue? (Y/N)");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        sc.close();
    }
}