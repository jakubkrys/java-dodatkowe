import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Type the quote to encode (IN CAPITALS): ");         // 10-13 zamiana Stringa na tablicę byte
        String quote = scanner.nextLine();
        //char[] s = quote.toCharArray();
        byte[] d = quote.getBytes(StandardCharsets.UTF_8);

        for (byte a : d) {                                                      // wyświetlenie Stringa zamienionego na tablicę byte
            System.out.print(a+" ");
        }
        System.out.println();

        for (int i = 0; i < d.length; i++) {
            if(d[i] < 'A' && d[i] > 'Z'){
                break;
            } else {
                d[i] = (byte) (65+((d[i]-62)%26));
            }
            System.out.print(d[i]+" ");
        }
        /*for (byte a : d) {
            if (a < 'A' && a > 'Z'){
                break;
            } else {
                a = (byte) (65+((a-62)%26));
            }
            System.out.println(a);
        }*/
    }
}
