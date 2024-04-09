    // 5th Invert half Pyramid Pattern(180):        *
    //                                            * *
    //                                          * * *
    //                                        * * * *
    //                                      * * * * *

import java.util.*;

public class P_5_InvertHalfPyramid_180{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
        System.out.print("\nEnter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("\nEnter the number of columns: ");
        int c = sc.nextInt();
        System.out.print("\n\tThe Pattern is: \n\n");
            for(int i=0; i<r; i++){
                for(int s =0; s<20; s++){
                    System.out.print(" ");
                }
                for(int j=0; j<c; j++){
                    if (i+j>=r-1) {
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
    //anoother way to solve this pattern
                                    // for(int i=0; i<r; i++){
                                    //     for(int s =0; s<20; s++){
                                    //         System.out.print(" ");
                                    //     } 
                                    //     for(int j = 0; j < r - i; j++) {
                                    //         System.out.print("  ");
                                    //     }
                                    //     for(int k = 0; k <= i; k++) {
                                    //         System.out.print("* ");
                                    //     }
                                    //     System.out.println();
                                    // }