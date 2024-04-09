    // 3rd half Pyramid Pattern:    1 
    //                              1 2
    //                              1 2 3                  // This sign is used to comment on single line
    //                              1 2 3 4
    //                              1 2 3 4 5

import java.util.*;

public class P_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
        System.out.print("\nEnter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("\n\tThe Pattern is: \n\n");
            for(int i=0; i<r; i++){
                for(int s =0; s<20; s++){
                    System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print((j+1)+" ");
                }
                System.out.println();
            }
            System.out.print("\n\tDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}