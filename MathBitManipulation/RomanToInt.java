import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String str) {
        if (str == null || str.isEmpty())
            return 0;
        int number = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        int i = 0;
        for (i = 0; i < str.length() - 1; i++) {
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {
                number = number - map.get(str.charAt(i));

            } else if (map.get(str.charAt(i)) > map.get(str.charAt(i + 1))) {
                number = number + map.get(str.charAt(i));
            } else
                number = number + map.get(str.charAt(i));

        }

        number = number + map.get(str.charAt(i));
        return number;
    }

    public static void main(String[] args) {
        String str = "III";
        System.out.println(romanToInt(str));
    }
}
