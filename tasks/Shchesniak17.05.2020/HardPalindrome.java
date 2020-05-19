package com.javarush.task.task19.task1912;

public class HardPalindrome {
    public static void hardFind(String string) {
        String longest = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (isPalindrome(string.substring(i, j))
                        && string.substring(i, j).length() > longest.length()
                        && string.substring(i, j).length() > 2) {
                    longest = string.substring(i, j);
                }
            }
        }
        System.out.println(longest);
    }

    public static boolean isPalindrome(String input) {
        StringBuilder plain = new StringBuilder(input);
        StringBuilder reverse = plain.reverse();
        return (reverse.toString()).equals(input);
    }
}
