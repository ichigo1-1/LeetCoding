class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        backtrack(ans,ds,freq,nums);
        return ans;        
    }
    public void backtrack(List<List<Integer>>ans,List<Integer>ds,boolean[]freq,int[]arr)
    {
        if(ds.size()==arr.length)
        {
            ans.add(new ArrayList<>(ds));//ye isiliye kartai so that when we make changse to ds ans is not affected.
            //if we do ans.add(ds);
            //itll create a shallow copy sp ans will be affcted whenever ds changes;
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!freq[i])
            {
                ds.add(arr[i]);
                freq[i]=true;
                backtrack(ans,ds,freq,arr);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}