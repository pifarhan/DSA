class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length ==0 || nums.length==1) {
            return;
        }
        int nz = 0;
        int z = 0;
        while(nz<nums.length) {
            if(nums[nz] !=0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                 nz++;
                z++;
            } else{
            
                nz++;
            }
        }
        
    }
}