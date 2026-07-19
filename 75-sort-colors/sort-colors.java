class Solution {
    public void sortColors(int[] nums) {
        int countOfZero=0;
        int countOfOne=0;
        int countOfTwo = 0;
        for(int i=0; i<nums.length;i++) {
            if(nums[i]==0) {
                countOfZero++;
            } else if(nums[i]==1) {
                countOfOne++;
            } else {
                countOfTwo++;
            }

        }
        int index = 0;

        // Fill 0s
        while (countOfZero > 0) {
            nums[index] = 0;
            index++;
            countOfZero--;
        }

        // Fill 1s
        while (countOfOne > 0) {
            nums[index] = 1;
            index++;
            countOfOne--;
        }

        // Fill 2s
        while (countOfTwo > 0) {
            nums[index] = 2;
            index++;
            countOfTwo--;
        }
        
    }
}