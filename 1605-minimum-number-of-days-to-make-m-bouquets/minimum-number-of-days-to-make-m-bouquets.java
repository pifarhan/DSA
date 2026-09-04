class Solution {

    static boolean canMake(int[] bloomDay, int days, int m, int k) {

        int bouquets = 0;
        int consecutiveFlowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {

            // Flower has bloomed by this day
            if (bloomDay[i] <= days) {

                consecutiveFlowers++;

                // We have enough consecutive flowers for one bouquet
                if (consecutiveFlowers == k) {
                    bouquets++;
                    consecutiveFlowers = 0;
                }

            } else {

                // This flower hasn't bloomed,
                // so consecutive sequence is broken
                consecutiveFlowers = 0;
            }
        }

        return bouquets >= m;
    }


    static int minDays(int[] bloomDay, int m, int k) {

        // Impossible if we don't have enough flowers
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int x : bloomDay) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, mid, m, k)) {

                // This day works.
                // Try to find an earlier day.
                high = mid - 1;

            } else {

                // This day doesn't work.
                // Need more days.
                low = mid + 1;
            }
        }

        return low;
    }

}