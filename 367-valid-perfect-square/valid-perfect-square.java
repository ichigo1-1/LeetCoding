class Solution {
    public boolean isPerfectSquare(int num) {
                    //time limit exceed
        // if(num==1)
        // {
        //     return true;
        // }

        // for (int i = 0; i <= num / 2; i++) {
        //     if (i * i == num) {
        //         return true;
        //     }

        // }
        // return false;

                    // brute
        // double val=Math.sqrt(num);
        // int res=(int)val;
        // if((res*res)==num)
        // {
        //     return true;
        // }
        // return false;

                        // BINARY SEARCH APPROACH
        long low=1;
        long high=num;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid>num)
            {
                high=mid-1;
            }
            else if(mid*mid<num){
                low=mid+1;
            }
        }
        return false;



    }
}