class Solution {

    public int maxsubarraysum(int[]nums) {
        int cs = nums[0];
        int ms = nums[0];
        for(int i=1; i<nums.length;i++) {
            cs = Math.max(nums[i] , cs+nums[i]);
            ms = Math.max(cs,ms);
        }
        return ms;
        
    }

    public int minsubarraysum(int[]nums) {
        int cs = nums[0];
        int ms = nums[0];
        for(int i=1; i<nums.length;i++) {
            cs = Math.min(nums[i], cs+nums[i]);
            ms= Math.min(cs,ms);
        }
        return ms;
    }


    public int maxSubarraySumCircular(int[] nums) {
        int total =0;
        for(int i=0;i<nums.length;i++) {
            total+= nums[i];
        }

        int max = maxsubarraysum(nums);
        if(max<0) {
            return max;
        }

        int min = minsubarraysum(nums);

        return Math.max(max, total-min);
    
        
    }


}