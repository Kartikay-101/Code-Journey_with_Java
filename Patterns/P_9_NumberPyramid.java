    //9th Number Pyramid Pattern:    1
    //                              2 2
    //                             3 3 3
    //                            4 4 4 4
    //                           5 5 5 5 5 

import java.util.*;
public class P_9_NumberPyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
        System.out.print("\nEnter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("\n\tThe Pattern is: \n\n");
            for(int i=0;i<r;i++){
                for(int s=0;s<20;s++){
                    System.out.print(" ");
                }
                for(int j=0;j<(r-1)-i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print((i+1)+" ");
                }
                System.out.println();
            }
            System.out.print("\n\tDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }
}