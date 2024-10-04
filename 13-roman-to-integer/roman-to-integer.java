import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int n = s.length() - 1;
        int res = map.get(s.charAt(n)); // Initialize result with the last character's value

        for (int i = n - 1; i >= 0; i--) {
            // Compare the values from the map
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res -= map.get(s.charAt(i)); // Subtract if current value is less than next value
            } else {
                res += map.get(s.charAt(i)); // Add otherwise
            }
        }
        return res; // Return the final result
    }
}
