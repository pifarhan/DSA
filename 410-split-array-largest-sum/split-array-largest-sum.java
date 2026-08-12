class Solution {
    static boolean canSplit(int nums[], int k, int largestSum) {
        int subarrays=1;
        int currentsum=0;

        for(int sum: nums) {
            if(currentsum+sum > largestSum) {
                subarrays++;
                currentsum=sum;
            } else {
                currentsum+=sum;
            }
        }
        return subarrays<=k;

    }

    public int splitArray(int[] nums, int k) {
        int low = 0;
        for(int x : nums) {
            low =Math.max(x,low);

        }
        int high = 0;
        for(int x: nums) {
            high +=x;
        }

        while(low<= high) {
            int mid = low+(high-low)/2;
            if(canSplit(nums,k,mid)) {
                high = mid-1;

            } else{
               low = mid+1;
            }
        }
        return low;
        
    }
}