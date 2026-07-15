import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.learning.util.StringUtil;

public class ReverseLettersStringTest {

    @Test
    void shouldReverseLettersKeepingSymbols() {
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void returnsEmptyForEmptyInput(){
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("");
        assertEquals("", result);
    }

    @Test
    void reversesOnlyOneLetter(){
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("a");
        assertEquals("a", result);
    }

    @Test
    void KeepNonLettersInPlace(){
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("123 !@#");
        assertEquals("123 !@#", result);
    }

    @Test
    void reversesOnlyLetters(){
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("abcd");
        assertEquals("dcba", result);
    }

    @Test
    void KeepNonLettersInEdgesAndInMiddle(){
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("!ab4cd?");
        assertEquals("!dc4ba?", result);
    }

    @Test
    void reversesLettersWithCorrectRegister(){
        StringUtil strUtil = new StringUtil();
        String result = strUtil.reverseLetters("aBcD");
        assertEquals("DcBa", result);
    }

    @Test
    void inputNULLString(){
        StringUtil strUtil = new StringUtil();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> strUtil.reverseLetters(null)
        );
        assertEquals("Строка не инициализирована (null)", exception.getMessage());
    }
}
