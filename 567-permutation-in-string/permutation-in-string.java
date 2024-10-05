class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size=s1.length();
        char[]a1=s1.toCharArray();
        Arrays.sort(a1);
        for(int i=0;i<=s2.length()-size;i++)
        {
            String s=s2.substring(i,i+size);
            char[]a2=s.toCharArray();
            Arrays.sort(a2);
            if(Arrays.equals(a1,a2))
            {
                return true;
            }
        }   
        return false;
    }
}