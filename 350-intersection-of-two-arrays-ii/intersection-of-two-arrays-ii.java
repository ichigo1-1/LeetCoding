class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i], hm.getOrDefault(nums1[i], 0) + 1);
        }

        // List to store the intersection elements
        ArrayList<Integer> intersection = new ArrayList<>();
        
        // Iterate over nums2 and check for intersections
        for (int i = 0; i < nums2.length; i++) {
            if (hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0) {
                intersection.add(nums2[i]);
                hm.put(nums2[i], hm.get(nums2[i]) - 1);  // Decrease the count in the hashmap
            }
        }
        // Convert the list to an array
        int[] res = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            res[i] = intersection.get(i);
        }

        return res;
    }
}