import java.util.HashMap;

public class FrequencyOfLettersInaString {
    public static HashMap<Character, Integer> frequencyOfLettersInaString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arrayOfStr = str.toCharArray();

        for (char c : arrayOfStr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    public static HashMap<Long, Integer> frequencyOfNumberInANumber(long num) {
        HashMap<Long, Integer> map = new HashMap<>();
        int[] arr = String.valueOf(num)
                .chars()
                .map(ch -> ch - '0')
                .toArray();
        for (long i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);

        }
        return map;
    }

    public static void main(String[] args) {
        String str = "mausamlodhi";
        long num = 121278387l;
        System.out.println(frequencyOfLettersInaString(str));
        System.out.println(frequencyOfNumberInANumber(num));
    }
}
