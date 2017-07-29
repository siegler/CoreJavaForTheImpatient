package Ch6;

import java.util.ArrayList;
/*
In the previous exercise, make Entry into a nested class. Should that class be generic?
 */
class Table2<K, V> {
    private ArrayList<Entry> entries = new ArrayList<>();
    public V get(K key) {
        for (Entry entry: entries) {
            if (entry.getKey() == key)
                return (V) entry.getValue();
        }
        return null;
    }
    public void put(K key, V value) {
        for (Entry entry: entries) {
            if (entry.getKey() == key) {
                entry.setValue(value);
            }
        }
        //new key
        entries.add(new Entry(key, value));
    }
    public Entry remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                return entries.remove(i);
            }
        }
        return null;
    }

    class Entry {
        private K key;
        private V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() { return key; }
        public V getValue() { return value; }
        public void setValue(V value) {
            this.value = value;
        }
    }
}
public class Ex4 {
    public static void main(String[] args) {
        Table2<String,Integer> stooges = new Table2<>();
        stooges.put("Moe",1);
        stooges.put("Curly",2);
        stooges.put("Shemp",3);
        System.out.println(stooges.get("Curly"));
    }
}
