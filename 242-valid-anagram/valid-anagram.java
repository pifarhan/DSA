class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {

            Integer count = map.get(ch);

            if (count == null)
                return false;

            if (count == 1)
                map.remove(ch);
            else
                map.put(ch, count - 1);
        }

        return map.isEmpty();
    }
}