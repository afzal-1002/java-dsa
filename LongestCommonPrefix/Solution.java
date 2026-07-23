
public class Solution {

    public static String longestCommonPrefix(String[] strs) {

        // Use the first string as our reference
        String first = strs[0];

        // Check every character of the first string
        for (int i = 0; i < first.length(); i++) {

            char currentChar = first.charAt(i);

            // Compare this character with all other strings
            for (int j = 1; j < strs.length; j++) {

                // Stop if:
                // 1. The current string is too short
                // 2. The characters are different
                if (i >= strs[j].length()
                        || strs[j].charAt(i) != currentChar) {

                    return first.substring(0, i);
                }
            }
        }

        // The complete first string is common
        return first;
    }

    public static void main(String[] args) {

        String[] words = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(words);

        System.out.println("Longest common prefix: \"" + result + "\"");
    }
}
