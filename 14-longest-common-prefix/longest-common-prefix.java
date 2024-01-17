class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);//if we sort then we just need to compare the 0th index and last index bec. def other characters in the middle will all be present in the last so no need to check for them.

        String first=strs[0];
        String last=strs[strs.length-1];
        int index=0;
        while(index<first.length())
        {
            if(first.charAt(index)==last.charAt(index))
            {
                index++;
            }
            else{
                break;
            }

        }
        return index==0?"":first.substring(0,index);

       
    }
}