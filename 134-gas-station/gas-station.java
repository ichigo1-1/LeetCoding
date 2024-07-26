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
        for (int i = 0; i < n; i++) {
            gasCount += gas[i] - cost[i];
            if (gasCount < 0) {
                start = i + 1;
                gasCount = 0;
            }
        }
        return start;
    }
}