class Solution {
    public int countnumbers(long curr,long next,int n)
    {
        int counter=0;
        while(curr<=n)
        {
            counter+=(next-curr);
            curr*=10;
            next*=10;
            //most important part
            //your next could go max till n+1,so you need to ensure it does
            next=Math.min(next,n+1);//if it exceeds let n+1 be the next
        }
        return counter;
    }
    public int findKthNumber(int n, int k) {
        int curr=1;
        k-=1;//since we have already considered 1 number so we have to now find k-1 number
        while(k>0)
        {
            int count=countnumbers(curr,curr+1,n);
            if(count<=k)
            {
                //move to next number
                curr++;
                k-=count;//as these many numbers were skipped now we need to find in another range with reduced k values which were already checked in prev curr
            }
            else{
                //it means it lies here in the next level
                k-=1;//as we are going level down so considering it
                curr*=10;
            }
        }
        return curr;
    }
}