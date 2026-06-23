class Solution {
   public static void func(int i,int[] nums,List<List<Integer>>ans,List<Integer>ds) {
        if(i == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        func(i+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        func(i+1,nums,ans,ds);
    
    }



    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>ds =  new ArrayList<>();
        func(0,nums,ans,ds);
        return ans;
        
    }
}