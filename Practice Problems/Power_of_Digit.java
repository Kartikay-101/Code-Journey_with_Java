    // Program to find the power of a number using a function.
    // Examples:
    // Power of 2^3 = 2*2*2 = 8.
    // Power of 3^4 = 3*3*3*3 = 81.
import java.util.*;

public class Power_of_Digit {
    public static int Fact(int num, int p) { // Function to find the power of a number.
        int fact = 1;
        if(num<0)
            System.out.println("Invalid input");
        
        for(int i = 1; i <= p; i++) { // Loop to find the power of a number.
            fact = fact * num;  // Power calculation.
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nWrite down a number: ");
        int num = sc.nextInt();
        if(num<1)
        System.out.println("Invalid input");
        else {
            System.out.print("Enter the power of "+num+": ");
        int p = sc.nextInt();
        int ans = Fact(num, p);    // Function call.
        System.out.println("\n\tThe Digit " + num + " to the power " + p +" is '" + ans +"'\n\n");
    }
        sc.close();
    }
}