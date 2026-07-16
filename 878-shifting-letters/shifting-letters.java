class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int suffix=0;
        char ans[] = s.toCharArray();

        for(int i=shifts.length-1;i>=0;i--) {
            suffix = (suffix+shifts[i])%26;
            ans[i]=(char) ((ans[i]-'a' + suffix)%26 +'a');
        }
        return new String(ans);
        
        
    }
}