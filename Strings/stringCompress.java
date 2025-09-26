public class stringCompress {
    public static void main(String[] args) {
        String name = "mmausamm";
        for (int i = 0; i < name.length(); i++) {
            Integer counter = 1;
            while (i < name.length() - 1 && name.charAt(i) == name.charAt(i + 1)) {
                counter++;
                i++;
            }

            System.out.print(name.charAt(i) + counter.toString() + " ");
        }
    }
}
