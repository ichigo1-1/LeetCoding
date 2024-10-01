class Solution {
    public boolean canArrange(int[] arr, int k) {
        //maths based problem
        //to reduce the problem to a 2sum problem 
        //store the arr[i]%k remainders with count on a map
        //note:- if your k is 7 the remainders value would be from 0 to k-1
        //[1,5,2,4,6,3]//here if k=7
        //
        //go till k-2 as the remaining elements would have already been paired with others so no need to        check them

        //now travserse till k/2
         //note:- if your k is 7 the remainders value would be from 0 to k-1

         //edge case
         int[]freq=new int[k];
         for(int it:arr)
         {
            int remainder=(it%k + k)%k;// Handle negative remainders then add +k and then also divide whole by k if to handle only pos int rem=(it%k);
            freq[remainder]++;
         }
         //edge case where all are zeroes
         //[10,15,20,30]k=5
         //here the rem would be 0 adn if you do rem-k=5 which doesnt exist so will return false which is wrong so to handle this check if o's freq is odd or even if odd return false directly
         if(freq[0]%2!=0)
         {
            return false;
         }
         //now check from 1 till k/2
         for(int rem=1;rem<=k/2;rem++)
         {
            int remaining=k-rem;
            if(freq[remaining]!=freq[rem])
            {
                return false;
            }
         }
         return true;
    }
}