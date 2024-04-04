class Solution {

    // R-1 C-1 FORMULA TO CALCULATE ELEMENT AT R ROW C COLUMN
    public int ncr(int n, int r) {
        if (r == 0 || r == n)
            return 1;
        
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int res = ncr(i, j);
                temp.add(res);
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}
