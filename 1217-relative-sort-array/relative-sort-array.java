class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        // Place elements according to arr2
        for (int i = 0; i < arr2.length; i++) {

            if (map.containsKey(arr2[i])) {

                for (int j = 0; j < map.get(arr2[i]); j++) {
                    arr1[index++] = arr2[i];
                }

                map.remove(arr2[i]);
            }
        }

        // Remaining elements
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        for (int num : list) {

            for (int j = 0; j < map.get(num); j++) {
                arr1[index++] = num;
            }
        }

        return arr1;
    }
}