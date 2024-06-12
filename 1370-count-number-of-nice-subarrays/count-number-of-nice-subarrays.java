class Solution {
    public int numberOfSubarrays(int[] nums, int goal){
        
        // int res=0;
        // for(int i=0;i<nums.length;i++)
        // {int count=0;
            
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         if(nums[j]%2==1)
        //         {
        //             count++;
        //         }
        //         if(count==k)
        //         {
        //             res++;
                    
        //         }
        //         else if(count>k){
        //             break;
        //         }
        //     }
        // }
        // return res;
        

        //SAME AS BINARY SUM TREAT ODD AS 1 AND OTEHRS AS 0
        //SO IT WILL REDUCE THE PROBLEM TO SAME AND IF SUM==K COUNT;
       HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int j = 0;
        int count = 0;
        int sum = 0;

        while (j < nums.length) {
            sum += nums[j] % 2;
            if (hm.containsKey(sum - goal)) {
                count += hm.get(sum - goal);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            j++;
        }
        return count;

    }
}