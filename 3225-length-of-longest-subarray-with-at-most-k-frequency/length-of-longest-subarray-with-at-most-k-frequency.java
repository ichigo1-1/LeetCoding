class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // int n=nums.length;
        // int result=0;
        // int i=0;
        // int j=0;
        // HashMap<Integer,Integer>hm=new HashMap<>();
        // while(j<n)
        // {
        //     hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
        //     while(i<j && hm.getOrDefault(nums[j],0)>k)
        //     {
        //         //minus karo ek
        //         hm.put(nums[i],hm.get(nums[i])-1);
        //         if(hm.get(nums[i])==0)
        //         {
        //             hm.remove(nums[i]);
        //         }
        //         i++;
        //     }
        //     result=Math.max(result,j-i+1);
        //     j++;
        // }
        // return result;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        int maxlen=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        
        while(j<n)
        {
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.getOrDefault(nums[j],0)>k)
            {
                //shrink
                hm.put(nums[i],hm.getOrDefault(nums[i],0)-1);
                //agar 0 hogia to hata do as size matters
                if(nums[i]==0)
                {
                    hm.remove(nums[i]);
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}