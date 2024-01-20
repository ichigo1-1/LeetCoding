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
        double val=Math.sqrt(num);
        int res=(int)val;
        if((res*res)==num)
        {
            return true;
        }
        return false;



    }
}