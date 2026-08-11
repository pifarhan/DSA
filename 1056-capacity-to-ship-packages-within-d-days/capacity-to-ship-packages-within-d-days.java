class Solution {
    static boolean canship(int[] weights, int capacity, int days) {
        int dayUsed = 1;
        int currentLoad = 0;
        for (int weight : weights) {
            if(currentLoad + weight>capacity){
                dayUsed++;
                currentLoad =weight;
            } else {
                currentLoad+= weight;
            }

        }
        return dayUsed<=days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        for (int x : weights) {
            low = Math.max(low, x);
        }
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(canship(weights,mid,days)) {
                high = mid-1;
            } else {
                low = mid+1;
            }

        }
        return low;

    }
}