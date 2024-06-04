class Solution {
    public int sliding(int []nums,int k)
    {
         HashMap<Integer,Integer>hm=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        int n=nums.length;
        while(j<n)
        {
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            while(hm.size()>k)//shrinking the window till size is greater
            {
                hm.put(nums[i],hm.get(nums[i])-1);
                if(hm.get(nums[i])==0)
                {
                    //remove it
                    hm.remove(nums[i]);
                }
                i++;
            }
            count+=(j-i+1);//number of subarrays ending at j
            j++; 
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sliding(nums,k)-sliding(nums,k-1);
        //as nums,k wala will include all subarrays with k or less than k which we not need so we can just subtract k-1 wiht k to bet the result
       
    }
}