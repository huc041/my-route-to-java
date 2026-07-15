package com.learning;

import com.learning.util.StringUtil;

public class Main {
    public static void main(String[] args) {

        String s = "J@va the be$t!123"; // →"t@eb eht av$J!123";
        //String s = "C0de_@ Rev!ew99"; // fteb eht av$a!1J3
        //String s = "Int3l#J Cor@2026x";
        //String s = ""; // fteb eht av$a!1J3
        if (s.isEmpty() || s.length() <=1) {
            System.out.println("Строка слишком короткая или пустая");
            return;
        }
        else {
                String result = StringUtil.reverseLetters (s);
                System.out.println(result);  // "avaJ"
        }
    }
}
