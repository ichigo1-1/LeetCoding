class Trie {
    Trie links[] = new Trie[26];
    boolean flag = false;

    public Trie() {

    }

    boolean containsKey(char ch) {
        return (links[ch - 'a'] != null);
    }

    void put(char ch, Trie node) {
        links[ch - 'a'] = node;
    }

    Trie get(char ch) {
        return links[ch - 'a'];
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }

    public void insert(String word) {
        Trie node = this;  // Start from the root of the Trie
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Trie());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean search(String word) {
        Trie node = this;  // Start from the root of the Trie
        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix) {
        Trie node = this;  // Start from the root of the Trie
        for (int i = 0; i < prefix.length(); i++) {
            if (!node.containsKey(prefix.charAt(i))) {
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
