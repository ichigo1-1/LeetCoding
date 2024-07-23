class Solution {
    public String addBinary(String a, String b) {
        int n=a.length()-1;
        int m=b.length()-1;
        int carry=0;
        int base=2;
        StringBuilder sb=new StringBuilder();
        while(n>=0 || m>=0)
        {
            int t1=0,t2=0,sum;
            if(n>=0)
            {
                t1=a.charAt(n--)-'0';
            }
            if(m>=0)
            {
                t2=b.charAt(m--)-'0';
            }
            sum=t1+t2+carry;
            if(sum>=base)
            {
                carry=1;
                sum=sum-base;
            }
            else{
                carry=0;
            }
            sb.append(sum);
        }
        if(carry==1)
        {
            sb.append(carry);
        }
        return sb.reverse().toString();
        } 
}