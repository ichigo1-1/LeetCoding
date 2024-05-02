class Solution {
    public long countSubstrings(String s, char c) {


        //add current c and the previous occurences of c
        long count=0;
        long ans=0;
        for(char ch:s.toCharArray())
        {
            if(ch==c)
            {
                //current ko add to karo hi and add the prev occurenecs
                ans+=(1+count);
                //as ive seen one c so increase count for prev occurences
                count++;
            }
        }
        return ans;


        //METHOD 2
        //AS WE HAVE TO START AND EN

        // int n = s.length();
        // long ans = 0;
        // long count = 0;

        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) == c){
        //         count++;
        //         ans += count;
        //     }
        // }
        // return ans;
        
    }
}