package praktek02;

public class RectangleAksi {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.panjang = 10;
        r1.lebar = 3;

        r1.cetakInfo();
        System.out.println("luas rectangle = " +r1.hitunganLuas());
        r1.cetakLuas();

        Rectangle r2 = new Rectangle();
        r2.cetakInfo();

        Rectangle r3 = new Rectangle(40,30);
        r3.cetakInfo();
    }

}
