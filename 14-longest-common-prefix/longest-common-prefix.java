class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null)
        {
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last = strs[strs.length - 1];
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<first.length() && i<last.length())
        {
            if(first.charAt(i)==last.charAt(i))
            {
                sb.append(first.charAt(i));
            }
            else{
                break;
            }
            i++;
        }
        return sb.toString();
    }
}