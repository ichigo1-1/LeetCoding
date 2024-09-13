
class Pair {
    int key, value;

    Pair(int k, int v) {
        key = k;
        value = v;
    }
}

class LRUCache {
    private final ArrayList<Pair> cache = new ArrayList<>();
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i).key == key) {
                int value = cache.get(i).value;
                // Remove the key from the list
                cache.remove(i);
                // Add it to the end to mark it as recently used
                cache.add(new Pair(key, value));
                return value;
            }
        }
        return -1; // Key not found
    }

    public void put(int key, int value) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i).key == key) {
                // Remove the old pair
                cache.remove(i);
                // Add the updated pair to the end
                cache.add(new Pair(key, value));
                return;
            }
        }

        // If the cache is full, remove the least recently used (first) entry
        if (cache.size() == capacity) {
            cache.remove(0);
        }
        // Add the new key-value pair
        cache.add(new Pair(key, value));
    }
}
