//nihal 
//230970065
package week5;

import java.util.*;

class CharacterSort {
    public static String sortAlphabetic(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static String sortAlphabeticIgnoreCase(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Sorting considering case
        String sortedWithCase = sortAlphabetic(input);
        System.out.println("OUTPUT STRING with case: " + sortedWithCase);

        // Sorting ignoring case
        String sortedIgnoreCase = sortAlphabeticIgnoreCase(input);
        System.out.println("OUTPUT STRING Without case: " + sortedIgnoreCase);
    }
}
