class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char str : s.toCharArray()) {
            map.put(str,map.getOrDefault(str,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>>pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());

        for(Map.Entry<Character,Integer> entry: map.entrySet()) {
            pq.offer(entry);
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()) {
            Map.Entry<Character,Integer> entry = pq.poll();

            for(int i=0; i<entry.getValue(); i++){
                sb.append(entry.getKey());

            }
        }

        return sb.toString();
        
    }
}