    // 3rd Invert half Pyramid Pattern: * * * * *
    //                                    * * * *
    //                                      * * *              // This sign is used to comment on single line
    //                                        * *
    //                                          *

import java.util.*;

public class P_4{
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
                    if (i<=j) {
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

                                                    // for(int i=0; i<r; i++){                                                                                      
                                                    //     for(int s =0; s<20; s++){                               
    // This Pattern can also solve by passing this  //             System.out.print(" ");
    // condition in if section                      //         }
                                                    //         for(int j=0; j<c; j++){
                                                    //             if (i==j || i==0 || j==c-1 || (i==2 && i<j) || (i==1 && i<j)) {
                                                    //                 System.out.print("* ");
                                                    //             }
                                                    //             else{
                                                    //                 System.out.print("  ");
                                                    //             }
                                                    //         }
                                                    //         System.out.println();
                                                    //     }