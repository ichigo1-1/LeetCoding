// class Solution {
//     public int divide(int dividend, int divisor) {
//         boolean sign=true;
//         // -n/d or n/-d
//         if(dividend>=0 && divisor<0)
//         {
//             sign=false;
//         }
//         if(dividend<=0 && divisor>0)
//         {
//             sign=false;
//         }
//         if(dividend==divisor)
//         {
//             return 1;
//         }
//         long dividend2=Math.abs((long)dividend);
//         long divisor2=Math.abs((long)divisor);

//         //we keep removing until we can 
//         long ans=0;
//         while(dividend2>=divisor2)
//         {
//             int count=0;
//             while (dividend2 >= (divisor2 << (count + 1)))
//             {
//                 count++;
//             }
//             ans+=(1<<count);
//             dividend2=dividend2-(divisor2*(1<<count));
        
//         }

//         if(ans==(1<<31) && sign==true)
//         {
//             return Integer.MAX_VALUE;
//         }
//         if(ans==(1<<31) && sign==false)
//         {
//             return Integer.MIN_VALUE;
//         }
//         return sign?(int)ans:(int)(-1*ans);
        
//     }
// }
class Solution {
    public int divide(int dividend, int divisor) {
        long quotient = 0;
        int sign = 1;
        int max = Integer.MAX_VALUE,  min = Integer.MIN_VALUE;
        if(dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0)sign = -1;
        long dd = (long)dividend , dv = (long)divisor;
        dd = Math.abs(dd);dv = Math.abs(dv);
        while(dd >= dv){
            int shift = 0;
            while(dd >= (dv<<shift))shift++;
            quotient += (long)1l<<(shift-1);
            // System.out.println(quotient+"-"+shift);
            dd -= dv<<(shift-1);
        }
        if(sign == 1){
            if(quotient > max)return max;
            return (int)quotient;
        }else{
            if((~quotient)+1 < min)return min; // ~quotient+1 = -quotient
            return (int)(~quotient)+1;
        }
    }
}