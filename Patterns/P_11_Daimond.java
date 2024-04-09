    //11th Daimond Pattern:  *
    //                      * *
    //                     * * *
    //                    * * * *
    //                   * * * * *
    //                  * * * * * *
    //                   * * * * *
    //                    * * * *
    //                     * * *
    //                      * *
    //                       * 

import java.util.*;
public class P_11_Daimond{
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
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=(r-2);i>=0;i--){
                for(int s=0;s<20;s++){
                    System.out.print(" ");
                }
                for(int j=0;j<(r-1)-i;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
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