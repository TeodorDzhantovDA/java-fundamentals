package task4_palindrome;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String wordFromInput = scanner.nextLine().toLowerCase();

        while(!wordFromInput.equals("end")) {
            boolean isPalindrome = true;

            for (int i = 0; i < wordFromInput.length() / 2; i++) {
                if (wordFromInput.charAt(i) !=
                        wordFromInput.charAt(wordFromInput.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome){
                System.out.println("Palindrome!!!");
            }else{
                System.out.println("Not a palindrome :(");
            }
            System.out.println("Enter a word:");
            wordFromInput = scanner.nextLine().toLowerCase();
        }
    }
}