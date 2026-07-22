import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public String sortVowels(String s) {

        ArrayList<Character> vowels = new ArrayList<>();

        // Step 1: Collect all vowels
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels.add(ch);
            }
        }

        // Step 2: Sort the vowels
        Collections.sort(vowels);

        // Step 3: Rebuild the string
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) != -1) {
                sb.append(vowels.get(index));
                index++;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}