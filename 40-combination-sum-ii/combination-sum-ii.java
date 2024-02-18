import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //sorting to avoid duplicate combinations and also as we have to show ans in lexical order.
        Arrays.sort(candidates);
        //creating a hashset to avoid duplicates
        Set<List<Integer>> result = new HashSet<>();
        solve(0, candidates, target, result, new ArrayList<>());
        //as we have to return list<list<integer>>
        List<List<Integer>> resultList = new ArrayList<>();
        //addall adds all hashset
        resultList.addAll(result);
        return resultList;

    }

    public void solve(int index, int[] candidate, int target, Set<List<Integer>> result, List<Integer> ds) {
        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < candidate.length; i++) {
            // Skip duplicates
            //skips the rest except the first candidate
            if (i > index && candidate[i] == candidate[i - 1]) {
                continue;
            }
            //mandatory cond. to avoid unnecessarry recursion calls
            // Skip if the current candidate is greater than the remaining target
            // if (candidate[i] > target) {
            //     break;
            // }
            if(target<0)
            {
                return;
            }

            ds.add(candidate[i]);
            // Recursively call with the next index and reduced target
            solve(i + 1, candidate, target - candidate[i], result, ds);
            // Backtrack
            ds.remove(ds.size() - 1);
            //now the rec present in the stack will continue
        }
    }
}
