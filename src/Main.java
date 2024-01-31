import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("_______");
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>(nums1);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Задание 3");
        List<String> strings = new ArrayList<>(List.of("БМВ", "АУДИ", "МЕРСЕДЕС", "ФОЛЬКСВАГЕН", "ШКОДА", "АУДИ", "БМВ"));
        Set<String> set1 = new HashSet<>(strings);
        System.out.println(set1);
        System.out.println("Задание 4");
        List<String> strings1 = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings1) {
            if (map.containsKey(string)) {
                Integer quantity = map.get(string);
                map.put(string, quantity + 1);
            } else {
                map.put(string, 1);
            }
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }
}



