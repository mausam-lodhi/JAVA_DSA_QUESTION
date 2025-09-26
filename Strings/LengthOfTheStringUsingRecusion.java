public class LengthOfTheStringUsingRecusion {
    public static int lengthOfString(char str[], int index) {
        if (index == str.length) {
            return 0;
        } else
            return 1 + lengthOfString(str, index + 1);
    }

    public static void main(String[] args) {
        String name = "mausam";
        char arr[] = name.toCharArray();

        System.out.println(lengthOfString(arr, 0));
    }
}
