class Solution {
    public int getSum(int a, int b) {
        //remember the sum TT SOLVED ON NEETCODE
        //NOTE IF THERES A CARRY WE SHIFT CARRY TO THE LEFT BIT
         int sum_without_carry=a^b;
        int carry=a&b;
        int actual_carry=carry<<1;//just do by taking 1 and 5 as examples 1+1=0 and carry=1 transfers to left bit
        while(carry!=0)
        {
            carry=sum_without_carry & actual_carry;
            sum_without_carry=sum_without_carry^actual_carry;
            actual_carry=carry<<1;
        }        
        return sum_without_carry;
        }
    }
