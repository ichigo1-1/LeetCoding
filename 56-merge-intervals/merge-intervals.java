class Pair implements Comparable<Pair> {
    int st;
    int et;

    Pair(int st, int et) {
        this.st = st;
        this.et = et;
    }

    public int compareTo(Pair other) {
        if (this.st != other.st) {
            return this.st - other.st;
        } else {
            return this.et - other.et;
        }
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Stack<Pair> s = new Stack<>();
        Pair[] pair = new Pair[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            pair[i] = new Pair(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(pair);
        
        for (int i = 0; i < pair.length; i++) {
            if (s.isEmpty()) {
                s.push(pair[i]);
            } else {
                Pair top = s.peek();
                if (pair[i].st > top.et) {
                    s.push(pair[i]);
                } else {
                    top.et = Math.max(top.et, pair[i].et);
                }
            }
        }
        
        Stack<Pair> rs = new Stack<>();
        while (!s.isEmpty()) {
            rs.push(s.pop());
        }
        
        int[][] result = new int[rs.size()][2];
        int index = 0;
        while (!rs.isEmpty()) {
            Pair p = rs.pop();
            result[index][0] = p.st;
            result[index][1] = p.et;
            index++;
        }
        return result;
    }
}