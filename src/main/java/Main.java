import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Testando MapToListAdapter
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");

        List<String> mapToList = new MapToListAdapter<>(map);
        System.out.println("Map to List Adapter:");
        System.out.println("Size: " + mapToList.size());
        mapToList.add("D");
        System.out.println("Contains 'C': " + mapToList.contains("C"));
        mapToList.remove("B");
        System.out.println("Size after remove: " + mapToList.size());

        // Testando ListToMapAdapter
        List<String> list = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        Map<Integer, String> listToMap = new ListToMapAdapter<>(list);
        System.out.println("\nList to Map Adapter:");
        System.out.println("Size: " + listToMap.size());
        listToMap.put(1, "W");
        System.out.println("Contains Key 1: " + listToMap.containsKey(1));
        System.out.println("Value at Key 1: " + listToMap.get(1));
    }
}
