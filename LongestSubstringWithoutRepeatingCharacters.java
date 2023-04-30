import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        // For Base condition
        if (s == null || s.equals("")) {
            return 0;
        }
        // If Starting window index
        int start = 0;
        // If Ending window index
        int end = 0;
        // If Maximum length of substring
        int maxLength = 0;
        // This set will be to store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();
        // It will Loop for each character in the string
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
