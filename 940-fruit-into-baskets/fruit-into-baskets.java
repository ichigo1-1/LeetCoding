class Solution {
    public int totalFruit(int[] fruits) {
        //BRUTE FORCE
        //TC:- O(N2)
        //SC:-O(3)as at max it can store 3 elements
        ///   TLE
        // int max=0;
        // for(int i=0;i<fruits.length;i++)
        // {
        //     HashSet<Integer>set=new HashSet<>();
        //     for(int j=i;j<fruits.length;j++)
        //     {
        //         set.add(fruits[j]);
        //         if(set.size()<=2)
        //         {
        //             max=Math.max(max,j-i+1);
        //         }
        //         if(set.size()>2)
        //         {
        //             break;
        //         }
        //     }
        
        // }
        // return max;      



             int l = 0;
             int n=fruits.length;
    int r = 0;
    int max = 0;
    HashMap<Integer, Integer> hm = new HashMap<>();

    while (r < n) {
        hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);
        if (hm.size() > 2) {
            if (hm.size() > 2) {
                hm.put(fruits[l], hm.get(fruits[l]) - 1);
                if (hm.get(fruits[l]) == 0) {
                    hm.remove(fruits[l]);
                }
                l++;
            }
        }
        
        max = Math.max(max, r - l + 1);
        r++;
    }
    
    return max;  
    }
}