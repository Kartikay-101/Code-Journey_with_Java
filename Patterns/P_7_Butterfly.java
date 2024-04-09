    // 7th Butterfly Pattern:    *             *
    //                           * *         * *
    //                           * * *     * * *
    //                           * * * * * * * *
    //                           * * * * * * * *
    //                           * * *     * * *
    //                           * *         * *
    //                           *             *
import java.util.*;
public class P_7_Butterfly{
    public static void main(String[] srgs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        char ch;
        do{
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            int space=2*((r-1)-i);
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            int space=2*((r-1)-i);
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("\nDo you want to continue? (Y/N): ");
        ch = sc.next().charAt(0);
    }while(ch == 'y' || ch == 'Y');
        sc.close();
    } 
}