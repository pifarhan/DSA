class Solution {
    static boolean canmake(int[] bloomDay, int days, int m, int k) {
        int bouquets = 0;
        int consecutiveflowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                consecutiveflowers++;

                if (consecutiveflowers == k) {
                    bouquets++;
                    consecutiveflowers = 0;
                }
            } else {
                consecutiveflowers = 0;
            }
        }
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        
        int low = 0;
        int high = 0;
        for (int x : bloomDay) {
            low = Math.min(x, low);
            high = Math.max(x, high);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canmake(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}