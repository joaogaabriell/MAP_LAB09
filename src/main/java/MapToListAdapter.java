import java.util.*;

public class MapToListAdapter<T> implements List<T> {
    private Map<Integer, T> map;

    public MapToListAdapter(Map<Integer, T> map) {
        this.map = map;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsValue(o);
    }

    @Override
    public Iterator<T> iterator() {
        return map.values().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return map.values().toArray(a);
    }

    @Override
    public boolean add(T element) {
        map.put(map.size(), element);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (map.containsValue(o)) {
            map.values().remove(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return map.values().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        int index = map.size();
        for (T item : c) {
            map.put(index++, item);
        }
        return true;
    }

    @Override
    public void clear() {
        map.clear();
    }

    // Métodos adicionais exigidos pela interface List, mas não suportados
    @Override
    public T get(int index) {
        return map.get(index);
    }

    @Override
    public T set(int index, T element) {
        return map.put(index, element);
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("add by index is not supported");
    }

    @Override
    public T remove(int index) {
        return map.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("indexOf is not supported");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("lastIndexOf is not supported");
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("listIterator is not supported");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("listIterator with index is not supported");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("subList is not supported");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("removeAll is not supported");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("retainAll is not supported");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }
}
