import java.util.ArrayList;
import java.util.Arrays;

class Table<K, V> {
    private ArrayList<Entry<K,V>> entries = new ArrayList<>();
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
    public Entry<K,V> remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                return entries.remove(i);
            }
        }
        return null;
    }
}

class Entry<K, V> implements Comparable {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public int compareTo(Object o) {
        return this.key == ((Entry<K,V>)o).getKey() ? 1: 0;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Table<String,Integer> stooges = new Table<>();
        stooges.put("Moe",1);
        stooges.put("Curly",2);
        stooges.put("Shemp",3);
        System.out.println(stooges.get("Curly"));
        Entry<String,Integer> stooge = stooges.remove("Shemp");
        System.out.println(stooge.getKey());
    }
}
