import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class getIthbit {
    public static int GetIthBit(int number, int index) {
        return ((number >> index) & 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.print(GetIthBit(number, 1));
    }

}
