package com.javarush.task.task19.task1912;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Anagrams {
    public static void findAnagrams(String fileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String result = "";
            int index = 0;
            while ((line = reader.readLine()) != null) {
                String[] array = line.split(" ");
                index++;
                if (sortString(array[0]).equals(sortString(array[1]))) {
                    result += index + " " + line + "\n";
                }
            }
            Files.write(Paths.get("D:\\Java\\testFiles\\test2.txt"), result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String sortString(String inputString) {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}