class Solution {
    public int countPrimes(int n) {
        int[]arr=new int[n];
        //calculate
        for(int i=2;i*i<n;i++){
            if(arr[i]==0)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    arr[j]=1;//they can never be prime
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(arr[i]==0)
            {
                c++;
            }
        }
        return c;
    }
}