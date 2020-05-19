package com.javarush.task.task19.task1912;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FindPalindrome {
    public static void palindrome(String fileName) {
        try {
            String[] strings = Files
                    .lines(Paths.get(fileName), Charset.defaultCharset())
                    .collect(Collectors.joining(" ")).split(" ");
            String result = "";
            for (String string : strings) {
                int index = 0;
                while (index < string.length() / 2) {
                    if (string.charAt(index) == string.charAt(string.length() - index - 1)) {
                        index++;
                    } else {
                        break;
                    }
                }
                if (index == string.length() / 2) {
                    result += string + "\n";
                    Files.write(Paths.get("D:\\Java\\testFiles\\test2.txt"), result.getBytes());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
