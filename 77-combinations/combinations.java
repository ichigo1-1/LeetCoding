class Solution {
    public void solve(int[]arr,int k,int i,List<List<Integer>> ans,List<Integer>ds,boolean[]freq,int n)
    {
        //base case
        if(ds.size()==k)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int j=i;j<n;j++)
        {
            if(freq[j]==false)
            {
                freq[j]=true;
                ds.add(arr[j]);
                solve(arr,k,j+1,ans,ds,freq,n);
                ds.remove(ds.size()-1);
                freq[j]=false;
             
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        //form up the array
        List<List<Integer>>ans=new ArrayList<>();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        boolean[]freq=new boolean[n];
        solve(arr,k,0,ans,new ArrayList<Integer>(),freq,n);
        return ans;
    }
}