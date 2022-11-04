package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>(
                Map.of("one", "eon", "two", "two", "four", true));


        Map<String, Object> data2 = new HashMap<>(
                Map.of("two", "own", "zero", 4, "four", true));


        Map<String, String> result = App.genDiff(data1, data2);
        System.out.println(result);

    }

    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> result = new TreeMap<>();
        map1.keySet().stream()
                .peek(key -> {
                    // Если мап2 содержит ключ из мап1
                    if (map2.containsKey(key)) {
                        // Если значение по одному ключу совпадает
                        if (map1.get(key).equals(map2.get(key))) {
                            result.put(key, "unchanged");
                            // Если значение по одному ключу не совпадает
                        } else if (!map1.get(key).equals(map2.get(key))) {
                            result.put(key, "changed");
                        } // Если мап2 не содержит ключ из мап1
                    } else if (!map2.containsKey(key)) {
                        result.put(key, "deleted");
                    }
                })
                .collect(Collectors.toList());
        map2.keySet().stream()
                .peek(key -> { // Если мап1 не содержит ключ из мап2
                    if (!map1.containsKey(key)) {
                        result.put(key, "added");
                    }
                })
                .collect(Collectors.toList());

        return result;
    }
}

//END
