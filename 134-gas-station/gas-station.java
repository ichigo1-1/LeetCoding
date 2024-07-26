class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int gasCount = 0;
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) {
            return -1;
        }
        int ans=start;
        for (int i = 0; i < n; i++) {
            gasCount += gas[i] - cost[i];
            if (gasCount < 0) {
                start = i + 1;
                gasCount = 0;
            }
            else{
                ans=i;
            }
            //we are not breaking here because if 1 ans is found no other will be satisfying the cond and at last will return true
        }
        return start;
    }
}