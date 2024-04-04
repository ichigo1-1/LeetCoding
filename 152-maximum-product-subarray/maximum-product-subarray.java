class Solution {
    public int maxProduct(int[] nums) {
        // int ans = nums[0];
        // int min = ans;
        // int max = ans;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]<0)
        //     {
        //         swap(min,max);
        //     }
        //     max = max(nums[i],max*nums[i]);
        //     min = min(nums[i],min*nums[i]);
        //     ans = max(ans,max);
            
        // }
        // return ans;

    int prefix=1;
    int suffix=1;
    int n=nums.length-1;
    int ans=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        
        if(prefix==0)
        {
            prefix=1;
        }
        if(suffix==0)
        {
            suffix=1;
        }
        prefix*=nums[i];
        suffix*=nums[n-i];
        ans=Math.max(ans,Math.max(prefix,suffix));
    }
    return ans;
















         
     
        
    }
        
    }
