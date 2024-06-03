class Solution {
    public String customSortString(String order, String s) {
        int[]freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        //jbtk order ka char milta hai tbtk append karo
        for(char ch:order.toCharArray())
        {
            while(freq[ch-'a']-->0)
            {
                sb.append(ch);
            }
        }
        //now add the rest
        for(char ch:s.toCharArray())
        {
            while(freq[ch-'a']-->0)
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}