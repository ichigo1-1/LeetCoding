class Solution {
    public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int boat = 0;
        // Process the people from both ends of the sorted array
        while (i <= j) {
            // Check if the lightest and heaviest person can share a boat
            if (people[i] + people[j] <= limit) {
                i++; // Lightest person can board with the heaviest person
            }
            // Either way, the heaviest person will take a boat
            j--;
            boat++;
        }
        
        return boat;
    }
}