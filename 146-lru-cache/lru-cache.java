
class Pair {
    int key, value;

    Pair(int k, int v) {
        key = k;
        value = v;
    }
}

class LRUCache {
    public  ArrayList<Pair> cache = new ArrayList<>();
    public  int capacity;

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
        return -1; // Key not found so return -1;
    }

    public void put(int key, int value) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i).key == key) {
                // Remove the old pair as we have to update it with newer valaue 
                //also put at last because it is recently used
                cache.remove(i);
                // Add the updated pair to the end to mark as recently used.
                cache.add(new Pair(key, value));
                return;
            }
        }

        // If the cache is full, remove the least recently used (first) entry
        if (cache.size() == capacity) {
            cache.remove(0);
            cache.add(new Pair(key, value));
        }
        else{
            //as capacity is already there insert directly
            cache.add(new Pair(key, value));
        }
    }
}
