class Solution {
    public boolean isHappy(int n) {
        int sum=1;
        HashSet<Integer>hm=new HashSet<>();
        while(n>1 && !hm.contains(n))
        {
            hm.add(n);
            sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
        }
        if(n==1)
        {
            return true;
        }
        return false;
    }
}