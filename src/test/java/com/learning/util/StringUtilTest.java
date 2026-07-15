package com.learning.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {

    private final StringUtil strUtil = new StringUtil();

    @Test
    void shouldReverseLettersKeepingSymbols() {
        String result = strUtil.reverseLetters("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void returnsEmptyForEmptyInput(){
        String result = strUtil.reverseLetters("");
        assertEquals("", result);
    }

    @Test
    void reversesOnlyOneLetter(){
        String result = strUtil.reverseLetters("a");
        assertEquals("a", result);
    }

    @Test
    void KeepNonLettersInPlace(){
        String result = strUtil.reverseLetters("123 !@#");
        assertEquals("123 !@#", result);
    }

    @Test
    void reversesOnlyLetters(){
        String result = strUtil.reverseLetters("abcd");
        assertEquals("dcba", result);
    }

    @Test
    void KeepNonLettersInEdgesAndInMiddle(){
        String result = strUtil.reverseLetters("!ab4cd?");
        assertEquals("!dc4ba?", result);
    }

    @Test
    void reversesLettersWithCorrectRegister(){
        String result = strUtil.reverseLetters("aBcD");
        assertEquals("DcBa", result);
    }

    @Test
    void inputNULLString(){
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> strUtil.reverseLetters(null)
        );
        assertEquals("Строка не инициализирована (null)", exception.getMessage());
    }
}
