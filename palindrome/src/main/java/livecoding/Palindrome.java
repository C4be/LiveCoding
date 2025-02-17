package livecoding;

public class Palindrome {

    public static boolean isPalindrom(String string) {
        // строки перед сравнением привести к нижнему или верхнему регистру
        string = to_lower_case(string);
        string = trim_str(string);
        string = remove_spaces_inside(string);
        return real_check_for_palindrom_string(string);
    }

    private static boolean real_check_for_palindrom_string(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;

        boolean isPalindrom = true;

        for (int i = 0; i < len; ++i) {
            
            if (chars[i] != chars[len - i - 1]) {
                isPalindrom = false;
                break;
            }

        }

        return isPalindrom;

    }

    private static String to_lower_case(String s) {
        return s.toLowerCase();
    }

    private static String trim_str(String s) {
        return s.trim();
    }

    private static String remove_spaces_inside(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                continue;
            }
        }

        return sb.toString();

    }

    
    
}
