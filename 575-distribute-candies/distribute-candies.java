class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set = new HashSet<>();
        for(int candy:candyType) {
            set.add(candy);
        }
        int allowed = candyType.length/2;
        int uniqueCandy = set.size();
        return Math.min(uniqueCandy,allowed);
        
    }
}