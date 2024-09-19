class Solution {
    public void solve(int i,int[]candidates,int t,List<List<Integer>>ans,List<Integer>ls)
    {
        //base case
        if(i==candidates.length)
        {
            if(t==0)
            {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(candidates[i]<=t)
        {
            ls.add(candidates[i]);
            solve(i,candidates,t-candidates[i],ans,ls);
            ls.remove(ls.size()-1);
        }
        solve(i+1,candidates,t,ans,ls);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}