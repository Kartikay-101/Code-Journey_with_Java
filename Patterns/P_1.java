    /*  1st Rectangular Pattern: * * * * *
                                 * * * * *          //  this sign is used to comment on multiple lines
                                 * * * * *
                                 * * * * *
                                 * * * * *    */

import java.util.*;
public class 1st_Rectangular_Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    // Scanner class to take input from user
        char ch;
        do {
            System.out.print("\nEnter the number of Rows: ");  // Taking input from user
            int r = sc.nextInt();  // Storing the input in variable r
            System.out.print("Enter the number of Columns: ");
            int c = sc.nextInt();

            System.out.println("\n\tThe Pattern is: \n");
            for(int i=0; i<r; i++){  // Loop begin
                for(int s=0; s<20; s++){ // Add spaces before each line
                    System.out.print(" ");
                }
                for( int y=0; y<c; y++){
                    System.out.print("* ");
                }
                System.out.println();  
            }
            System.out.print("\n\tDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0); // Assign a value to ch
        }while( ch == 'y' || ch == 'Y');
        
        sc.close(); // Closing the Scanner object
    }
}