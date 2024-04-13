    // Program to check if a number is Armstrong number or not.
    // Example:
    // 153 = 1^3 + 5^3 + 3^3 = 153
    // 9474 = 9^4 + 4^4 + 7^4 + 4^4 = 9474

import java.util.*;

public class Armstrong_Number {  
    public static void Armstrong(int num,int store, int i, int arm){
        arm=i=0;
        for( store=num; store!=0; i++){     // To find the number of digits in the number
            store=store/10;
        }
        for( store=num; store!=0;){     
            int rem=store%10;
            arm+=Math.pow(rem, i);  
            store/=10;
        }
        if(arm==num){
            System.out.println("\n"+num+" is an Armstrong number.");
        }
        else{
            System.out.println("\n"+num+" is not an Armstrong number.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{     // To check multiple numbers
        System.out.print("\n\tEnter a number to check whether it's an Armstrong number or not: ");
        int number = sc.nextInt();
        Armstrong(number,0,0,0);
        System.out.print("\nDo you want to check another number? (Y/N): ");
        ch = sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');
        sc.close();
    }
}
                                    // public static void Armstrong(int num){
                                    //     int store = num;
    // This Logic can also applied  //     int rem;
    // in this problem.             //     int arm = 0;
                                    //     int numberOfDigits = String.valueOf(num).length();
                                    //     while(num != 0){
                                    //         rem = num % 10;
                                    //         arm += Math.pow(rem, numberOfDigits); // For Armstrong number, the power is the number of digits
                                    //         num /= 10;
                                    //     }
                                    //     if(arm == store)
                                    //         System.out.println(store + " is an Armstrong number.");
                                    //     else
                                    //         System.out.println(store + " is not an Armstrong number.");
                                    // }
