class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {

        //BRUTE FORCE
    // int n = arr.length;
    // int count = 0;
    // for (int i = 0; i <= n - k; i++) {
    //     int sum = 0;
    //     for (int j = i; j < i + k; j++) {   
    //         sum += arr[j];
    //     }
    //     if (sum / k >= threshold) {
    //         count++;
    //     }
    // }
    // return count;


    //SLDIING WUNDIW
    int i=0;
    int j=0;
    int sum=0;
    int count=0;
    int n=nums.length;
    while(j<n)
    {
        sum+=nums[j];
        if(j-i+1==k)
        {
            int len=j-i+1;
            if(sum/len>=threshold)
            {
                count++;
            }
            //shrink
            sum-=nums[i];
            i++;
        }
        j++;
    }
    return count;
    }
}