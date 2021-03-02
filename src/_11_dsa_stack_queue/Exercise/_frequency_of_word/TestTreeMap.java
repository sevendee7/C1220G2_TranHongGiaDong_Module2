package _11_dsa_stack_queue.Exercise._frequency_of_word;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        String string = "abc def ghi abc xzc def ty abc";
        String[] array = string.split(" ");
        for (int i = 0; i < array.length; i++) {
            treeMap.putIfAbsent(array[i], 0);
            for (String key : treeMap.keySet()) {
                if (key.equals(array[i])) {
                    treeMap.replace(key, treeMap.get(key).intValue()+1);
                }
            }
        }
        System.out.println(treeMap);
    }
}
