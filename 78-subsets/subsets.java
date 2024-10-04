class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        int sub=1<<n;
        for(int i=0;i<sub;i++)
        {
            List<Integer>ds=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(((i&(1<<j))!=0))
                {
                    ds.add(nums[j]);
                }
            }
            ans.add(new ArrayList(ds));
        }
        return ans;
    }
}