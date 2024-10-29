import java.util.*;

public class ListToMapAdapter<K, V> implements Map<K, V> {
    private List<V> list;

    public ListToMapAdapter(List<V> list) {
        this.list = list;
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
        if (key instanceof Integer) {
            return (Integer) key < list.size();
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public V get(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return (index >= 0 && index < list.size()) ? list.get(index) : null;
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return (index < list.size()) ? list.set(index, value) : null;
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return list.remove(index);
        }
        return null;
    }

    @Override
    public void clear() {
        list.clear();
    }

    // Métodos adicionais exigidos pela interface Map, mas não suportados
    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("keySet is not supported");
    }

    @Override
    public Collection<V> values() {
        return list;
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
