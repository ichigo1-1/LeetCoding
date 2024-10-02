class Solution {
    public int subarraySum(int[] a, int k) {
        
                        //BRUTE FORCE APPROACH 
        // int count=0;
        // for(int i=0;i<a.length;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<a.length;j++)
        //     {
        //         sum+=a[j];
        //         if(sum==k)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count;
        
        //OPTIMIZED SOLUTION
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(hm.containsKey(sum-k))
            {
                count+=hm.get(sum-k);
            }

                hm.put(sum,hm.getOrDefault(sum,0)+1);

        }
        return count;
    }
}
