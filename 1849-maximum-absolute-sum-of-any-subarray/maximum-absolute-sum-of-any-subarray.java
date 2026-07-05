class Solution {
    public int maxsubarraysum(int[]nums) {
        int cs=nums[0];
        int ms =nums[0];
        for(int i=1;i<nums.length;i++) {
            cs =Math.max(nums[i] , cs+nums[i]);
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    

    public int minsubarraysum(int[]nums) {
        int cs=nums[0];
        int ms =nums[0];
        for(int i=1;i<nums.length;i++) {
            cs =Math.min(nums[i] , cs+nums[i]);
            ms = Math.min(cs,ms);
            
        }
        return ms;
    }


    public int maxAbsoluteSum(int[] nums) {
        return Math.max(maxsubarraysum(nums) ,Math.abs(minsubarraysum(nums)) );
        
    }
}