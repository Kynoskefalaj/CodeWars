import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false; // Early return if str2 is longer than str1
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrence of each character in str1
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check if str2 can be formed using the characters from str1
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }
}