import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Degiskenleri tanimladik.
        int k = 0, total = 0;

        // Scanner sinifina ait degiskeni projemize dahil ettik.
        Scanner input = new Scanner(System.in);


        // While dongusu yardimiyla kullanicidan degerler alip uygun olanlari topladik.
        while (k % 2 == 0) {

            System.out.print("Bir deger gir: ");
            k = input.nextInt();

            if (k % 2 == 0 && k % 4 == 0) {
                total += k;
            }
        }
        System.out.println("Sarti saglayan sayilarin toplami: " + total); // Kullaniciya sonuc yansitildi.
    }
}