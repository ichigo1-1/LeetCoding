class Solution {
    public String minWindow(String s, String t) {
        
        int windowStart = 0, minLength = Integer.MAX_VALUE, matched = 0, start = 0;
        Map<Character, Integer> tMap = new HashMap<>();
        //pehle put all the character to map
        for(char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        //now start the sliding
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            //agar pehle se hai map me to freq ghatao
            char currChar = s.charAt(windowEnd);
            if(tMap.containsKey(currChar)) {
                tMap.put(currChar, tMap.get(currChar) - 1);
                //ghatane ka baad check if its freq is > 0
                //if yes ive found a ,matching character
                if(tMap.get(currChar) >= 0) {
                    matched += 1;
                }
            }
            //agar all characters are matched
            while(matched == t.length()) {
                //and cuurennt length is smaller than previous 
                if(minLength > (windowEnd - windowStart + 1)) {
                    minLength = windowEnd - windowStart + 1;
                    start = windowStart;
                }
                char leftChar = s.charAt(windowStart);
                windowStart += 1;

                if(tMap.containsKey(leftChar)) {
                    if(tMap.get(leftChar) == 0) {
                        matched -= 1;
                    }
                    tMap.put(leftChar, tMap.get(leftChar) + 1);
                }
            }
        }

        if(minLength > s.length()) {
            return "";
        }
        return s.substring(start, start + minLength);
    }
}
