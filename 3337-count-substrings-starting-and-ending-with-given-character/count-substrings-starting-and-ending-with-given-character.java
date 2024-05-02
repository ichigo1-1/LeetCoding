class Solution {
    public long countSubstrings(String s, char c) {

        int n = s.length();
        long ans = 0;
        long count = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                count++;
                ans += count;
            }
        }
        return ans;
        
    }
}