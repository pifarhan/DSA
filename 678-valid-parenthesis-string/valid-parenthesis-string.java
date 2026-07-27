class Solution {
    public boolean checkValidString(String s) {

        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                low++;
                high++;
            }

            else if (ch == ')') {
                low--;
                high--;
            }

            else { // ch == '*'
                low--;
                high++;
            }

            // Too many closing brackets
            if (high < 0) {
                return false;
            }

            // low should never be negative
            if (low < 0) {
                low = 0;
            }
        }

        return low == 0;
    }
}