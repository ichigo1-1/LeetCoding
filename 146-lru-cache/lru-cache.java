
// class Pair {
//     int key, value;

//     Pair(int k, int v) {
//         key = k;
//         value = v;
//     }
// }

// class LRUCache {
//     public  ArrayList<Pair> cache = new ArrayList<>();
//     public  int capacity;

//     public LRUCache(int capacity) {
//         this.capacity = capacity;
//     }

//     public int get(int key) {
//         for (int i = 0; i < cache.size(); i++) {
//             if (cache.get(i).key == key) {
//                 int value = cache.get(i).value;
//                 // Remove the key from the list
//                 cache.remove(i);
//                 // Add it to the end to mark it as recently used
//                 cache.add(new Pair(key, value));
//                 return value;
//             }
//         }
//         return -1; // Key not found so return -1;
//     }

//     public void put(int key, int value) {
//         for (int i = 0; i < cache.size(); i++) {
//             if (cache.get(i).key == key) {
//                 // Remove the old pair as we have to update it with newer valaue 
//                 //also put at last because it is recently used
//                 cache.remove(i);
//                 // Add the updated pair to the end to mark as recently used.
//                 cache.add(new Pair(key, value));
//                 return;
//             }
//         }

//         // If the cache is full, remove the least recently used (first) entry
//         if (cache.size() == capacity) {
//             cache.remove(0);
//             cache.add(new Pair(key, value));
//         }
//         else{
//             //as capacity is already there insert directly
//             cache.add(new Pair(key, value));
//         }
//     }
// }


class LRUCache {
    private final int capacity;
    private final HashMap<Integer, Integer> cache;
    private final LinkedHashSet<Integer> usage;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.usage = new LinkedHashSet<>();
    }
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        // Move the accessed key to the end to show that it was recently used
        usage.remove(key);
        usage.add(key);
        return cache.get(key);
    }
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            // Remove the old key to update its position in usage
            usage.remove(key);
        } else if (cache.size() >= capacity) {
            int lruKey = usage.iterator().next();
            usage.remove(lruKey);
            cache.remove(lruKey);
        }
        cache.put(key, value);
        usage.add(key);
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */