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
    int j = 0;
    int n = a.length;
    int count = 0;
    int sum = 0;
    HashMap<Integer,Integer>hm=new HashMap<>();
    hm.put(0,1);//the current sum=0 for edge cases wex:-[-1,1,0]
    while (j < n) {
        sum+=a[j];
        if(hm.containsKey(sum-k))
        {
            count+=hm.get(sum-k);
        }
        hm.put(sum,hm.getOrDefault(sum,0)+1);
        j++;
    }

    return count;
       

        
        
        
    }
}
