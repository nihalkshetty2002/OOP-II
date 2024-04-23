//nihal 
//230970065
package week5;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two string");
        String S1 = sc.nextLine();
        System.out.print("");
        String S2 = sc.nextLine();
        System.out.print("\nInput position : ");
        int p = sc.nextInt();
        System.out.print("\n\nInput length : ");
        int l = sc.nextInt();
        System.out.println("\nUppercase of "+S1+" is "+S1.toUpperCase());
        System.out.println("Lowercase of "+S2+" is "+S2.toLowerCase());
        System.out.println("Substring of "+S1+" from postition "+p+" with length "+l+" = "+S1.substring(p,(p+l)));
        System.out.println("After inserting "+S2+" into "+S1+" at postion "+p+" = "+S1.substring(0,p)+ S2 +S1.substring(p));
        System.out.println("After appending "+S2+" to "+S1+" = "+(S1+S2));

        sc.close();
    }
}
