class Solution {

    // R-1 C-1 FORMULA TO CALCULATE ELEMENT AT R ROW C COLUMN
    
    // public int ncr(int n, int r) {
    //     // if (r == 0 || r == n)
    //     //     return 1;
        
    //     int res = 1;
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }
    
    public List<List<Integer>> generate(int numRows) {
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int i = 0; i < numRows; i++) {
        //     List<Integer> temp = new ArrayList<>();
        //     for (int j = 0; j <= i; j++) {
        //         int res = ncr(i, j);
        //         temp.add(res);
        //     }
        //     ans.add(new ArrayList<>(temp));
        // }
        // return ans;
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

for (int n = 0; n < numRows; n++) {
    List<Integer> row = new ArrayList<>();
    long ans = 1;
    
    // Printing the first element of the row
    row.add((int) ans);

    // Calculate and store the rest of the elements in the row
    for (int i = 1; i <= n; i++) {
        ans = ans * (n - i + 1) / i;
        row.add((int) ans);
    }
    
    // Add the current row to the triangle
    pascalsTriangle.add(row);
}

return pascalsTriangle;





        
    }
}
