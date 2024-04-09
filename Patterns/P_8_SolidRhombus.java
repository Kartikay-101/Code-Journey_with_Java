    // 8th Solid Rhombus Pattern:    *****
    //                              *****
    //                             *****
    //                            *****
    //                           *****
import java.util.*;
public class P_8_SolidRhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.print("Enter the number of rows: ");
            int r = sc.nextInt();
            System.out.print("\n\tThe Pattern is: \n\n");
            for(int i=0;i<r;i++){
                int sapce=(r-1)-i;
                for(int j=0;j<sapce;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<r;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.print("\nDo you want to continue? (Y/N): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close(); 
    }
}
                                                     // for(int i=(r-1);i>=0;i--){
                                                     //     for(int j=0;j<=i;j++){
    // This Pattern can also solve by passing this   //         System.out.print(" ");
    // condition in if section                       //     }
                                                     //     for(int j=0;j<r;j++){
                                                     //         System.out.print("*");
                                                     //     }
                                                     //     System.out.println();
                                                     // }