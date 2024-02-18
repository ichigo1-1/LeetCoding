class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //we ve used sorting to reduce the xtra rec calls.
        //also to avoid duplicates
        Arrays.sort(candidates);
        List<List<Integer>>ans = new ArrayList<>();
        solve(0,candidates,target,ans,new ArrayList<>());
        return ans;

        
    }
    public void solve(int index,int[]candidate,int target,List<List<Integer>>ans,List<Integer>ds)
    {
        //Base case
        if(index==candidate.length)
        {
            //beacuse it is a problem of sum
            if(target==0)
            {
                //add the combination to ans
                ans.add(new ArrayList(ds));
            }
            //else just return as it is not the ans
            return;
        }
        //if the element is only smaller or equal to the target then only take the element else theres no use
        if(candidate[index]<=target)
        {
            ds.add(candidate[index]);
            // reduce the target by the last added element.
            // take condition(continue with the same index)
            solve(index,candidate,target-candidate[index],ans,ds);
            //always remove the element you added to the ds while backtracking as we are referencing the ds data structure we need to remove it by ourseleves otherwise we would ve been continued with {2,2,2} instead of taking {2,2};
            ds.remove(ds.size()-1);
        }
        //else continue with the next index but the same target;
        solve(index+1,candidate,target,ans,ds);
    
    }
}