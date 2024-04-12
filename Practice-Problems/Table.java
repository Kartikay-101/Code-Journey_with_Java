    // Program to print the table of a number entered by the user.
    
import java.util.*;
public class Table {
    public static int table(int num){
        System.out.println("\n   Table of "+num+" is: \n");
        for(int i=1;i<=10;i++){
            System.out.println("\t"+i+") "+num+" * "+i+" = "+num*i); 
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.print("\n\nEnter a number to print its table: ");
            int number = sc.nextInt();
            table(number);
            System.out.print("\n ~Do you want to continue? (Y/N)");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
        sc.close();
    }
}
