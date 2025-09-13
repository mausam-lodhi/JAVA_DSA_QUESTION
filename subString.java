public class subString {
    public static String Substr(String str, int si, int ei) {
        String string = "";
        for (int i = si; i < ei; i++) {
            string = str.charAt(i) + string;

        }
        return string;
    }
    public static void main(String[] args) {
        String str = "mausam";
        System.out.print(Substr(str , 1 , 3));
    }
}
