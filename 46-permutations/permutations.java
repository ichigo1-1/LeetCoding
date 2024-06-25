class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean[]freq=new boolean[nums.length];
        rec(0,ans,ds,freq,nums);
        return ans;
    }
    public void rec(int i,List<List<Integer>>ans,List<Integer>ds,boolean[]freq,int[]nums)
    {
        //base case
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int ind=0;ind<nums.length;ind++)
        {
                if(freq[ind]==false)
                {
                    freq[ind]=true;
                    //add
                    ds.add(nums[ind]);
                    //take
                    rec(ind,ans,ds,freq,nums);
                    //remove
                    ds.remove(ds.size()-1);
                    //mark as unvisitede
                    freq[ind]=false;
                }
        }
    
    }
}