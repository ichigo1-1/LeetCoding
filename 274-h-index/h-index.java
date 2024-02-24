class Solution {
    public int hIndex(int[] citations) {

        //you can sort and then perform binary search to get the h index
        //but as sorting would take nlogn+ binary search would take logn its complexity would inccrease hence this is preffred when it ias already sorted.
        //we solve this using a bucket array and travsering from right to end checking cond asap cond satisfies we return
        int[]bucket=new int[citations.length+1];//ek jada islea banayai just in case citation 100 hai so i wont create bucket of 100 size ill just store that 100 on that index
        //as 100>size of citation no possible ans
        //we traverse from right to left
        for(int i=0;i<citations.length;i++)
        {
            //as length hi chota hai comapred to valaue 100 no way it could be h index;
            if(citations[i]>citations.length)
            {
                bucket[citations.length]++;
            }
            else{
                //bucket[5]-->1,  bucket[5]-->2;
                bucket[citations[i]]++;
            }
        }
        int count=0;
        //as we need h index we traverse from right to left to get max h index
        for(int i=bucket.length-1;i>=0;i--)
        {
            count+=bucket[i];
            if(count>=i)
            {
                return i;
            }
        }
        return 0;
        
    }
}