    /* 2nd Hollow Rectangular Pattern: * * * * *
                                       *       *
                                       *       *
                                       *       *
                                       * * * * *   */

import java.util.*;

public class P_2_HollowRectangular{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
        System.out.print("\nEnter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int c = sc.nextInt();
        System.out.print("\n\tThe Pattern is: \n\n");
            for(int i=0; i<r; i++){
                for(int s=0; s<20; s++){
                    System.out.print(" ");
                }
                for(int j=0; j<c; j++){
                    if ( i==0 || j==0 || i==r-1 || j==c-1) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.print("\n\tDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');

        sc.close();
    }
}