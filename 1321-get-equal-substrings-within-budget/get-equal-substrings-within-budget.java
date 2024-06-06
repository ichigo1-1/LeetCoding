class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int i=0;
        int j=0;
        int maxlength=0;
        int currentcost=0;
        while(j<n)
        {
            currentcost+=Math.abs(s.charAt(j)-t.charAt(j));
            while(currentcost>maxCost)
            {
                currentcost-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
          
            maxlength=Math.max(maxlength,j-i+1);
            j++;
        }
        return maxlength;

        
    }
}