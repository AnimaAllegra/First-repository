package com.javarush.task.task19.task1912;

public class BruteForce {
    public static void bruteForce(String whichFind, String string) {
        for (int i = 0; i <= string.length() - whichFind.length(); i++) {
            String substring = string.substring(i, i + whichFind.length());
            if (whichFind.equals(substring)) {
                System.out.println(i);
            }
        }
    }
}
