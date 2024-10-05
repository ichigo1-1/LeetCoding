class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // int size=s1.length();
        // char[]a1=s1.toCharArray();
        // Arrays.sort(a1);
        // for(int i=0;i<=s2.length()-size;i++)
        // {
        //     String s=s2.substring(i,i+size);
        //     char[]a2=s.toCharArray();
        //     Arrays.sort(a2);
        //     if(Arrays.equals(a1,a2))
        //     {
        //         return true;
        //     }
        // }   
        // return false;

        if(s1.length()>s2.length())
        {
            return false;
        }
        int[]s1_freq=new int[26];
        int[]s2_freq=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            s1_freq[s1.charAt(i)-'a']++;
        }
        //now freq 2
        int i=0;
        int j=0;
        int n=s2.length();
        while(j<n)
        {
            s2_freq[s2.charAt(j)-'a']++;
            //agar size bara hogaya
            if(j-i+1>s1.length())
            {
                s2_freq[s2.charAt(i)-'a']--;
                i++;
            }
            //check if freq of both the arrays are same 
            if(Arrays.equals(s1_freq,s2_freq))
            {
                return true;
            }
            j++;
        }
        return false;
    }
}