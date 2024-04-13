    // Program to print ASCII value of all characters from 0 to 127
    // ASCII stands for American Standard Code for Information Interchange
    // ASCII table consists of 128 characters, where each character is assigned a unique decimal number from 0 to 127

public class ASCII_Value {
    public static void main(String[] args){
        System.out.println("\n\tASCII Table Value of Characters~~\n");
        System.out.println("    'Number = Character'\n");
        for(int i=1; i<=128; i++){
            for(int space=0; space<10; space++){    // To give space between the decimal and character
                System.out.print(" ");
            }
            System.out.println(i + " = " + (char)i);
        }
        System.out.println("\n");
    }
}