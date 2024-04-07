    // 3rd Pattern: * 
    //              * * 
    //              * * *               // This sign is used to comment on single line
    //              * * * * 
    //              * * * * *

import java.util.*;

public class P_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("\nEnter the number of columns: ");
        int c = sc.nextInt();
        System.out.print("\n\tThe Pattern is: \n\n");
        char ch;
        do{
            for(int i=0; i<r; i++){
                for(int s =0; s<20; s++){
                    System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.print("\n\tDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}