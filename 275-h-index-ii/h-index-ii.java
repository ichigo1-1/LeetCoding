class Solution {
    public int hIndex(int[] citations) {
         int low = 0;
    int high = citations.length - 1;
    int n = citations.length;
    int ans = 0;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (n - mid <= citations[mid]) {
            ans = n - mid; // Update with the count of papers, not citations
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return ans;
        
    }
}