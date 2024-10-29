import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToListAdapterTest {

    @Test
    void testSize() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        List<String> adapter = new MapToListAdapter<>(map);
        assertEquals(2, adapter.size());
    }

    @Test
    void testAdd() {
        Map<Integer, String> map = new HashMap<>();
        List<String> adapter = new MapToListAdapter<>(map);
        adapter.add("C");
        assertTrue(adapter.contains("C"));
        assertEquals(1, adapter.size());
    }

    @Test
    void testRemove() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        List<String> adapter = new MapToListAdapter<>(map);
        adapter.remove("A");
        assertFalse(adapter.contains("A"));
        assertEquals(0, adapter.size());
    }

    @Test
    void testGet() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        List<String> adapter = new MapToListAdapter<>(map);
        assertEquals("B", adapter.get(1));
    }

    @Test
    void testSet() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        List<String> adapter = new MapToListAdapter<>(map);
        adapter.set(0, "B");
        assertEquals("B", adapter.get(0));
    }
}
