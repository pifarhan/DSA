class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];   // Previous Smaller Index
        int[] right = new int[n];  // Next Smaller Index

        Stack<Integer> stack = new Stack<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        // Next Smaller Element
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = stack.peek();
            }

            stack.push(i);
        }
        long sum = 0;
        int MOD = 1000000007;

        for (int i = 0; i < n; i++) {

            long leftChoices = i - left[i];
            long rightChoices = right[i] - i;

            long contribution =
                    (long) arr[i] * leftChoices * rightChoices;

            sum = (sum + contribution) % MOD;
        }

        return (int) sum;
    }
}