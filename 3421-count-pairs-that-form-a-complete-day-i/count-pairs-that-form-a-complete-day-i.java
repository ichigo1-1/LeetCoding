class Solution {
    public int countCompleteDayPairs(int[] hours) {
        // int sum=0;
        // for(int i=0;i<hours.length-1;i++)
        // {
        //     for(int j=i+1;j<hours.length;j++)
        //     {
        //         if((hours[i]+hours[j])%24==0)
        //         {
        //             sum++;
        //         }
        //     }
        // }
        // return sum;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for (int i = 0; i < hours.length; i++) {
            int remainder = hours[i] % 24;
            // Calculate the complement remainder that when added to the current remainder makes a multiple of 24
            int complement = (24 - remainder) % 24;
            // Increment count by the number of elements that have the complement remainder
            if (hm.containsKey(complement)) {
                count += hm.get(complement);
            }
            // Update the hashmap with the current remainder
            hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}