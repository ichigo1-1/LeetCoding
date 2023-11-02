class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>output=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(nums,0,output,ans);
        return ans;
    }
    public static void backtrack(int[]arr,int i,List<Integer>output,List<List<Integer>>ans)
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<Integer>(output));
            return;
        }
        //ACRC
        output.add(arr[i]);
        backtrack(arr,i+1,output,ans);
        output.remove(output.size()-1);
        backtrack(arr,i+1,output,ans);
        
    }
}