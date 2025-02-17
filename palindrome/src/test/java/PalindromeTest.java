import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import livecoding.Palindrome;

public class PalindromeTest {

    @Test
    void string_shalash_test_1() {
        assertEquals(true, Palindrome.isPalindrom("шалаш"));
    }

    @Test
    void string_shalash_test_2() {
        assertEquals(true, Palindrome.isPalindrom(" шалаш "));
    }

    @Test
    void string_mama_test() {
        assertEquals(false, Palindrome.isPalindrom("мама"));
    }
    
    @Test
    void string_for_diff_case() {
        assertEquals(true, Palindrome.isPalindrom("Шалаш"));
    }

    @Test
    void string_space_check_test() {
        assertEquals(true, Palindrome.isPalindrom("          шалаш"));
    }
    
    @Test
    void string_even_string() {
        assertEquals(true, Palindrome.isPalindrom("тоот"));
    }

    @Test
    void string_language_string() {
        assertEquals(false, Palindrome.isPalindrom("соc"));
    }

    @Test
    void string_sentence_string() {
        assertEquals(true, Palindrome.isPalindrom("А роза упала на лапу Азора"));
    }
}
