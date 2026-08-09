package com.learning.lesson2.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {

    @Test
    void shouldReverseLettersKeepingSymbols() {
        String result = StringUtil.reverseLetters("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void returnsEmptyForEmptyInput(){
        String result = StringUtil.reverseLetters("");
        assertEquals("", result);
    }

    @Test
    void reversesOnlyOneLetter(){
        String result = StringUtil.reverseLetters("a");
        assertEquals("a", result);
    }

    @Test
    void KeepNonLettersInPlace(){
        String result = StringUtil.reverseLetters("123 !@#");
        assertEquals("123 !@#", result);
    }

    @Test
    void reversesOnlyLetters(){
        String result = StringUtil.reverseLetters("abcd");
        assertEquals("dcba", result);
    }

    @Test
    void KeepNonLettersInEdgesAndInMiddle(){
        String result = StringUtil.reverseLetters("!ab4cd?");
        assertEquals("!dc4ba?", result);
    }

    @Test
    void reversesLettersWithCorrectRegister(){
        String result = StringUtil.reverseLetters("aBcD");
        assertEquals("DcBa", result);
    }

    @Test
    void inputNULLString(){
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> StringUtil.reverseLetters(null)
        );
        assertEquals("Строка не инициализирована (null)", exception.getMessage());
    }
}
