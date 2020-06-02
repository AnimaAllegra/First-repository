package com.company;
import java.io.*;
public class OWWO1 {
    int offset=3;
    public String decrypt(String s) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t >= 'A' && t <= 'Z') {
                int t1 = t - 'A' - offset;
                if (t1 < 0) t1 = 26 + t1;
                sb.append((char) (t1 + 'A'));
            } else if (t >= 'a' && t <= 'z') {
                int t1 = t - 'a' - offset;
                if (t1 < 0) t1 = 26 + t1;
                sb.append((char) (t1 + 'a'));
            }
        }
        return sb.toString();
    }
}
