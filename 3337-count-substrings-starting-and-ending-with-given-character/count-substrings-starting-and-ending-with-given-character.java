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

        //AS WE HAVE TO START AND END WITH SAME CHAR WE CAN USE COMBINATION LIKE 
        //4C2 AND THEN COUNT THE INDVIDUAL OCCURENECS
        //EXAMPLE:-ABADA  C=A
        //AS WE NEED TO FORM SUBS STARTING AND ENDING WITH A 
        //POSSIBLE COMB COULD BE A____A (3C2)ARRANGING 3 A'S IN 2 POSIIYTON + INDIVIDUAL AS



        //EASY METHOD
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