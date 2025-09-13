import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class setIthbit {
    public static int SetIthBit(int number, int index) {
        return (number << index) | number;
    }

    public static void main(String[] args) {
        int number = 10;
        // System.out.print(SetIthBit(number, 1));
        System.out.print(number << 1);
    }

}
