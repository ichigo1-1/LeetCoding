class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0,j=0;
        int n=nums.length;
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        while(j<n)
        {
            sum+=nums[j];
            if(hm.containsKey(sum-goal))
            {
                count+=hm.get(sum-goal);

            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            j++;
        }
        return count;
    }
}