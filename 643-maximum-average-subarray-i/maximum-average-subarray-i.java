class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        int sum=0; 
        double maxAvg= Integer.MIN_VALUE;
        for(int right =0; right<nums.length; right++) {
            sum+=nums[right];

            if(right-left+1==k) {
               maxAvg = Math.max(maxAvg, (double) sum / k);

                sum -= nums[left];
                left++;
            }

        }
        return maxAvg;
        
    }
}