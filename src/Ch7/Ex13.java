package Ch7;

import java.util.LinkedHashMap;
import java.util.Map;
/*
The LinkedHashMap calls the method removeEldestEntry whenever a new element is inserted. Implement a subclass Cache that
limits the map to a given size provided in the constructor.
 */
class Cache extends LinkedHashMap {
    private final int capacity;
    public Cache(int initialCapacity) {
        super(initialCapacity);
        capacity = initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }
}
public class Ex13 {
    public static void main(String[] args) {
        Cache map = new Cache(2);
    }
}
