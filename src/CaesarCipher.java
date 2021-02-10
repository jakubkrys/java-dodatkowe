import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Type the quote to encode (IN CAPITALS): ");         // 10-13 zamiana Stringa na tablicę byte
        String quote = scanner.nextLine();
        char[] s = quote.toCharArray();
        byte[] d = quote.getBytes(StandardCharsets.UTF_8);

        for (byte a : d) {                                                      // 15-18 wyświetlenie Stringa zamienionego na tablicę byte
            System.out.print(a+" ");
        }
        System.out.println();

        for (int i = 0; i < d.length; i++) {                                    // 20-28 wyświetlenie zakodowanego Stringa zamienionego na tablicę byte
            if(d[i] < 'A' && d[i] > 'Z'){
                break;
            } else {
                d[i] = (byte) (65+((d[i]-62)%26));
            }
            System.out.print(d[i]+" ");
        }
        System.out.println();

        for (char b : s){                                                       // 30-33 wyświetlenie Stringa zamienionego na tablicę char
            System.out.print(b+" ");
        }
        System.out.println();

        for (int i = 0; i < s.length; i++) {                                    // 35-41 wyświetlenie zakodowanego Stringa zamienionego na tablicę char
            if(s[i] < 'A' && s[i] > 'Z'){
                break;
            } else {
                s[i] = (char) (65+((s[i]-62)%26));
            }
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
