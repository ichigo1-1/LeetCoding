class Solution {
    public int subarraySum(int[] a, int k) {
        
                        //BRUTE FORCE APPROACH 
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=i;j<a.length;j++)
            {
                sum+=a[j];
                if(sum==k)
                {
                    count++;
                }
            }
        }
        return count;
        
        //OPTIMIZED SOLUTION
       

        
        
        
    }
}
