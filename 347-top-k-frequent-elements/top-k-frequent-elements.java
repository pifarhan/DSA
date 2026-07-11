class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);

        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            pq.offer(entry);
            if(pq.size() >k) {
                pq.poll();
            }
        }
        int [] ans = new int[k];
        for(int i =k-1; i>=0;i--) {
            ans[i] = pq.poll().getKey();
        }

        return ans;
        
    }
}