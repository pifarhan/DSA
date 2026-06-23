class Solution {
    void func(int i, int [] nums , List<List<Integer>>ans, ArrayList<Integer>ds) {
        ans.add(new ArrayList<>(ds));
        for(int j =i; j<nums.length;j++) {
            if(j>i && nums[j] == nums[j-1]) continue;
            ds.add(nums[j]);
            func(j+1,nums,ans,ds);
            ds.remove(ds.size()-1);;
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,ans,new ArrayList<>());
        return ans;
        
    }
}