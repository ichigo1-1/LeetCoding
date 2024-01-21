class Solution {
                            //***************BRUTE FORCE APPROACH****************
    // public int calculate(int[]weights,int cap)
    // {
    //     int days=1;
    //     int load=0;
    //     int res=0;
        
    //     for(int i=0;i<weights.length;i++)
    //     {
    //         if(load+weights[i]>cap)
    //         {
    //             days=days+1;
    //             load=weights[i];
                
    //         }
    //         else{
    //             load+=weights[i];
    //         }

    //     }
    //     return days;
    // }
    // public int shipWithinDays(int[] weights, int days) {


    //     int low=Integer.MIN_VALUE;
    //     int high=0;
    //     for (int i = 0; i < weights.length; i++) {
    //         high += weights[i];
    //         low = Math.max(low, weights[i]);
    //     }


    //     for(int i=low;i<=high;i++)
    //     {
    //         if(calculate(weights,i)<=days)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;

        

        
    // }
    // public int calculate(int[]weights,int cap)
    // {
    //     int days=1;
    //     int load=0;
    //     int res=0;
        
    //     for(int i=0;i<weights.length;i++)
    //     {
    //         if(load+weights[i]>cap)
    //         {
    //             days=days+1;
    //             load=weights[i];
                
    //         }
    //         else{
    //             load+=weights[i];
    //         }

    //     }
    //     return days;
    // }

    public int calculate(int[]weights,int cap)
    {
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++)
        {
            if(load+weights[i]>cap)
            {
                days=days+1;
                load=weights[i];
                
            }
            else{
                load+=weights[i];
            }

        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {

        int low = Integer.MIN_VALUE,high = 0;
        for (int i=0;i<weights.length;i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
  
        //Binary search
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int number_of_days=calculate(weights,mid);
            if(number_of_days<=days)
            {
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        return low;




      
}
}