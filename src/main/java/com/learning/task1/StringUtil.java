package com.learning.task1;

public class StringUtil {
    public static String reverseString(String s) {
        int n = s.length();
        char c = s.charAt(0);
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if(!Character.isLetter(chars[left])){
                left++;
            }
            else if(!Character.isLetter(chars[right])){
                right--;
            }
            else {
                char tmp = chars[left];     // меняем местами края
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     // сдвигаем указатели навстречу
                right--;
            }
        }
        String str = new String(chars);
        return str;
    }
}
