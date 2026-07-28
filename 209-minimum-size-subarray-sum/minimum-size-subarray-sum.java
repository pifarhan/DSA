class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left =0;
        int currsum =0;
        int minLen = Integer.MAX_VALUE;
        for(int right =0; right<nums.length;right++) {
            currsum += nums[right];
           
            while(currsum >= target) {
                 minLen = Math.min(minLen,right-left+1);
                currsum-=nums[left];
                left++;
            }

        }
        return (minLen==Integer.MAX_VALUE)?0:minLen;

        
    }
}