public class OOPS {
    public static void main(String[] args) {
        Cube c = new Cube(12, 12, 12);
        c.volume();

    }
}

class Reactangle {
    int len;
    int breath;

    Reactangle(int len, int breath) {
        this.len = len;
        this.breath = breath;
        System.out.println("hello");

    }

    void Area() {
        System.out.println(this.len * this.breath);
    }
}

class Cube extends Reactangle {
    int height;

    Cube(int len, int breath, int height) {
        super(len, breath);
        this.height = height;

    }

    void volume() {
        System.out.println((this.len * this.breath * this.height));
    }
}Jharkhand, jamshedpur, gamharia, bolaidih
