class Solution {
    public int len(int n)
    {
        String s=String.valueOf(n);
        return s.length();
    }
    public int addDigits(int num) {
        int sum=num;
        while(len(sum)>1)
        {
            sum=0;
            while(num>0)
            {
                int rem=num%10;
                sum+=rem;
                num/=10;
            }
            num=sum;
        }
        return sum;
    }
}