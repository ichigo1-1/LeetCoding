class Solution {
    public boolean check(int[]arr)
    {
        int i=1;
        int j=arr.length-2;
        int prev=arr[0]+arr[arr.length-1];
        while(i<=j)
        {
            int cur=arr[i]+arr[j];
            if(cur!=prev)
            {
                return false; 
            }
            i++;
            j--;
        }
        return true;
    }
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum=0;
        int n=skill.length;
        if(check(skill)==true)
        {
            for(int i=0;i<skill.length/2;i++)
            {
                sum+=(long)skill[i]*skill[n-i-1];
            }
            return sum;
        }
        else{
            return -1;
        }
    }
}