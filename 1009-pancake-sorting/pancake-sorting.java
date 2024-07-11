class Solution {
    public void flip(int []arr,int n)
    {
        int i=0;
        int j=n;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public int find_largest(int []arr,int n)
    {
        int idx=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[idx])
            {
                idx=i;
            }
        }
        return idx;
    }
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer>res=new ArrayList<>();
        //elements are from 1->size
        //if size==4 range 1->4
        int n=arr.length;
        for(int i=n;i>1;i--)
        {
            int largest=find_largest(arr,i);
            flip(arr,largest);
            res.add(largest+1);
            flip(arr,i-1);
            res.add(i);
        }
        return res;
    }
}