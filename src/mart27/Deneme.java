package mart27;

public class Deneme {
    int x = 10, y;

    Deneme() {
        System.out.println(x * y);


    }

    Deneme(int x, int y) {
        this();
        this.x = x;
        this.y = 10;
        System.out.println(x * y);

    }

    Deneme(int x, int y, int z) {
        this(y, z);
        this.x = x;
        this.y = y;
        System.out.println(x * z);
    }

    public static void main(String[] args) {
        Deneme dnm = new Deneme(3, 4, 5);
        System.out.println(dnm.x * dnm.y);
    }
}
/*
sirasitla calisacak satirlar
27,28,20,21,12,13,6,7,10,14,15,16,18,22,23,24,25,29

 */
