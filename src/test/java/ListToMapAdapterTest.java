import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListToMapAdapterTest {

    @Test
    void testSize() {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        Map<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertEquals(2, adapter.size());
    }

    @Test
    void testPut() {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        Map<Integer, String> adapter = new ListToMapAdapter<>(list);
        adapter.put(1, "Z");
        assertEquals("Z", adapter.get(1));
    }

    @Test
    void testContainsKey() {
        List<String> list = new ArrayList<>();
        list.add("X");
        Map<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertTrue(adapter.containsKey(0));
        assertFalse(adapter.containsKey(2));
    }

    @Test
    void testContainsValue() {
        List<String> list = new ArrayList<>();
        list.add("X");
        Map<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertTrue(adapter.containsValue("X"));
        assertFalse(adapter.containsValue("Y"));
    }

    @Test
    void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        Map<Integer, String> adapter = new ListToMapAdapter<>(list);
        adapter.remove(0);
        assertEquals(1, adapter.size());
        assertFalse(adapter.containsValue("X"));
    }
}
