import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        Code code = new Code();
        int option;

        do {
            System.out.println("Type the sentence (IN CAPITALS): ");
            String sentence = scanner.nextLine();
            char[] s = sentence.toCharArray();

            System.out.println();
            System.out.println("What you want to do with this sentence?:");
            System.out.println("1. Encode");
            System.out.println("2. Decode");
            System.out.println("9. Quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    code.encode(sentence);
                    System.out.println("----- end of encrytpion -----");
                    System.out.println();
                    break;
                case 2:
                    code.decode(sentence);
                    System.out.println("----- end of decrytpion -----");
                    System.out.println();
                    break;
                case 9:
                    break;
            }
        } while (option != 9);
        System.out.println("--------------");
        System.out.println("CODING IS OVER");
        System.out.println("--------------");

        /*for (int i = 0; i < s.length; i++) {                                    // wyświetlenie zakodowanego Stringa zamienionego na tablicę char za pomocą pętli
            if(s[i] < 'A' && s[i] > 'Z'){
                break;
            } else {
                s[i] = (char) (65+((s[i]-62)%26));
            }
            System.out.print(s[i]+"");
        }*/
    }
}
