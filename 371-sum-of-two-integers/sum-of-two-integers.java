class Solution {
    public int getSum(int a, int b) {
        //remember the sum TT SOLVED ON NEETCODE
        //NOTE IF THERES A CARRY WE SHIFT CARRY TO THE LEFT BIT
        int sum=a^b;
        int carry=a&b;
        int actual_carry=carry<<1;
        while(carry!=0)
        {
            //do carry first as if sum is done first itll be updated and previous value will be gone
            carry=sum&actual_carry;   
            sum=sum^actual_carry;
            
            actual_carry=carry<<1;
        }
        return sum;
    }
}