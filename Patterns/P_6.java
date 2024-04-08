// 5th Pattern:    1 0 1 0 1
//                 0 1 0 1
//                 1 0 1
//                 0 1
//                 1

    import java.util.*;

    public class P_6{
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
                    for(int j=0; j<c; j++)
                        if (i+j<=r-1) {
                            int sum = i+j;
                            if (sum%2==0) {
                                System.out.print("1 ");
                            }
                            else{
                                System.out.print("0 ");
                            }
                        }
                        else{
                            System.out.print("  ");
                        }
                    System.out.println();
                }
                System.out.print("\n\tDo you want to continue? (Y/N): ");
                ch = sc.next().charAt(0);
            }while(ch == 'y' || ch == 'Y');
            sc.close();
        }
    }
                                                        // for(int i=r; i>=1; i--){
                                                        //     for(int s =0; s<20; s++){
    // This Pattern can also solve by passing this      //         System.out.print(" ");
    // condition in if section                          //     }
                                                        //     for(int j=0; j<=i; j++)
                                                        //             System.out.print("* ");
                                                        //         }
                                                        //     System.out.println();
                                                        // }