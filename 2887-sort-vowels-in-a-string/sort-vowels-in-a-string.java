class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                vowels.add(ch);

            }

        }
        Collections.sort(vowels);
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                sb.append(vowels.get(index));
                index++;

            } else {
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}