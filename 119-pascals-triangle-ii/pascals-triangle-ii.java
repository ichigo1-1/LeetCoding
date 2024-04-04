import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public BigInteger ncr(int n, int r) {
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        return res;
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            BigInteger res = ncr(rowIndex, i);
            ans.add(res.intValue());
        }
        return ans;
    }
}
