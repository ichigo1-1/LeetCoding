import java.util.*;

class Solution {
    class Meeting implements Comparable<Meeting> {
        int start, end;

        Meeting(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public int compareTo(Meeting m) {
            if (this.end < m.end) {
                return -1; // ascending
            } else if (this.end > m.end) {
                return 1;
            }
            return 0;
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        ArrayList<Meeting> ar = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            ar.add(new Meeting(intervals[i][0], intervals[i][1]));
        }
        Collections.sort(ar);

        int count = 1;
        int n = intervals.length;
        int limit = ar.get(0).end;

        for (int i = 1; i < n; i++) {
            if (ar.get(i).start >= limit) { // overlapping
                count++;
                limit = ar.get(i).end;
            } 
        }
        return n-count;
    }
}

    