class Solution {
    public int beautySum(String s) {
        int beauty=0;
        for(int i=0;i<s.length();i++)
        {
            int[]freq=new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
                int min=getMin(freq);
            int max=getMax(freq);
            beauty+=max-min;
                
            }
            
        }
        return beauty;

    }
    public int getMax(int[]freq)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++)
        {
            max=Math.max(freq[i],max);
        }
        return max;
    }
    public int getMin(int[] freq) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                min = Math.min(freq[i], min);
        }
        return min;
    }
}

