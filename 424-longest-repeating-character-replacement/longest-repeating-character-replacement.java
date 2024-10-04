class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int n=s.length();
        int maxfreq=0;
        int ans=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        while(j<n)
        {
            char current=s.charAt(j);
            hm.put(current,hm.getOrDefault(current,0)+1);
            int len=j-i+1;
            maxfreq=Math.max(maxfreq,hm.get(current));
            int changes=len-maxfreq;
            if(changes>k)
            {
                char start=s.charAt(i);
                hm.put(start,hm.get(start)-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}