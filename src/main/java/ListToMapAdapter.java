import java.util.*;

public class ListToMapAdapter<K, V> implements Map<K, V> {
    private final List<V> list;

    public ListToMapAdapter(List<V> list) {
        this.list = list;
    }

    private int indexOf(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index >= 0 && index < list.size()) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return indexOf(key) >= 0;
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public V get(Object key) {
        int index = indexOf(key);
        return (index >= 0) ? list.get(index) : null;
    }

    @Override
    public V put(K key, V value) {
        if (!(key instanceof Integer)) {
            return null;
        }
        int index = (Integer) key;
        if (index >= 0 && index < list.size()) {
            return list.set(index, value);
        }
        if (index == list.size()) {
            list.add(value);
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        int index = indexOf(key);
        return (index >= 0) ? list.remove(index) : null;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Collection<V> values() {
        return list;
    }

    // Operações da interface Map sem correspondência direta em uma List
    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("keySet is not supported");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("entrySet is not supported");
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("putAll is not supported");
    }
}
