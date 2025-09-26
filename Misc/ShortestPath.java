public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'E') {
                x += 1;
            }
            if (str.charAt(i) == 'W') {
                x -= 1;
            }
            if (str.charAt(i) == 'N') {
                y += 1;
            }
            if (str.charAt(i) == 'S') {
                y -= 1;
            }

        }
        double ShortestPath = Math.sqrt((x * x + (y * y)));
        System.out.println("Shortest distance is : " + ShortestPath);
    }


}
