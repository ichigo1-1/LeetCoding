class Solution {
    public boolean haszeroes(int []arr)
    {
        for(int it:arr)
        {
            if(it!=0)
            {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        int[]arr=new int[26];
        int k=p.length();
        for(int i=0;i<k;i++)
        {
            char ch=p.charAt(i);
            arr[ch-'a']++;
        }
        int start=0,end=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            //1.remove the freq at j to satisy freq 0 cond once len matcching happens
            arr[s.charAt(end)-'a']--;
            //2.check if len matches
            if(end-start+1==k)
            {
                if(haszeroes(arr))
                {
                    res.add(start);
                }
                //3.as len == k so shift window,when shifting add the ith freq again as it wont be in window again
                arr[s.charAt(start)-'a']++;
                start++;
            }
            //4.j increments everytime
            end++;
        }
        return res;
        
    }
}