//nihal 
//230970065
package week5;

import java.util.*;

class palindrome {
    public String str, revstr;

    public palindrome(String s) {
        str = s;
    }

    public void reverse() {
        int strlength = str.length();
        revstr = ""; // Initialize revstr
        for (int i = (strlength - 1); i >= 0; i--) 
        { 
            revstr = revstr + str.charAt(i);
        }

        System.out.println("The string in reverse: " + revstr);
        
        if (str.equalsIgnoreCase(revstr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String s = sc.next();
        palindrome p = new palindrome(s); 
        p.reverse();
    }
}
