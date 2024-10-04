class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int i=0;
        int j=0;
        int count=0;
        int n=nums.length;
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