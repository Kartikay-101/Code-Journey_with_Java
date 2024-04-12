    // Program to find the factorial of a number using a function.
    // Examples:
    // Factorail of 7 = 7*6*5*4*3*2*1 = 5040.
    // Factorail of 5 = 5*4*3*2*1 = 120.

import java.util.*;
public class Factorial{
    public static int Fact(int i, int fact,int k){ // Function to find the factorial of a number.
        fact=i=1;
        for(i=1; i<=k; i++){ // Loop to find the factorial of a number.
            fact = fact*i;  // Factorial calculation.
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nWrite down a number: ");
        int num = sc.nextInt();
        int ans = Fact(1, 1, num);    // Function call.
        System.out.println("\n\tThe Factorial of " + num + " is: " + ans +"\n\n");
        sc.close();
    }
}