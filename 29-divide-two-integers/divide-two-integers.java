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
       public static int divide(int dividend, int divisor) {
        if (Integer.MIN_VALUE == dividend && divisor == -1)
            return Integer.MAX_VALUE;
        int ans = 0;
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        while (a - b >= 0) {
            int temp = b;
            int count = 1;
            while (a - (temp << 1) >= 0) {
                temp <<= 1;
                count <<= 1;
            }
            a -= temp;
            ans += count;
        }
        return (dividend > 0) == (divisor > 0) ? ans : -ans;
    }
}