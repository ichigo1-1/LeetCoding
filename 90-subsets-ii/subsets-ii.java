class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Arrays.sort(nums); // Sort the input array to handle duplicates
        backtrack(nums, ans, output, 0);
        return ans;
        
    }
     public void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> output, int start) {
        ans.add(new ArrayList<>(output)); // Add the current subset to the result
        
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Include the current element in the subset
            output.add(nums[i]);
            
            // Recursively generate subsets starting from the next index
            backtrack(nums, ans, output, i + 1);
            
            // Backtrack: Remove the last element to backtrack
            output.remove(output.size() - 1);
        }
}
}
