class Solution {
    public String getPermutation(int n, int k) {
        List<Integer>numbers=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
            numbers.add(i);
        }
        //add the last number i.e 4
        numbers.add(n);
        String ans="";
        //as were considering 0 based indexing well take k-1;
        k=k-1;
        while(true)
        {
            ans=ans+numbers.get(k/fact);//16/6=3;
            numbers.remove(k/fact);
            // all the conditions are fulfilled
            if(numbers.size()==0)
            {
                break;
            }
            k=k%fact;//index to be found
            fact=fact/numbers.size();
        }
        return ans;
    }
}