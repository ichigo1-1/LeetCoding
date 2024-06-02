class Solution {
    class Pair {
        int ind;
        char ch;

        Pair(int ind, char ch) {
            this.ch = ch;
            this.ind = ind;
        }

        public int getFirst() {
            return ind;
        }

        public char getChar() {
            return ch;
        }
    }

    public String clearStars(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> {
            if (p1.ch == p2.ch) {
                return Integer.compare(p2.ind, p1.ind);
            } else {
                return Character.compare(p1.ch, p2.ch);
            }
        });

        int n = s.length();
        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == '*') {
                // Ensure the priority queue is not empty before polling
                if (!pq.isEmpty()) {
                    int index = pq.poll().getFirst();
                    arr[index] = '*';
                }
            } else {
                pq.add(new Pair(i, arr[i]));}
            
        }

        // Create the result by ignoring '*'
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            if (ch != '*') {
                sb.append(ch);
            }
        }

        return sb.toString();
        }}
