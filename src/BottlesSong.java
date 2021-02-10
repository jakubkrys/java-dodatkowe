public class BottlesSong {
    public static void main(String[] args) {
        int iloscButelek = 99;
        String slowo = "bottles"; // liczba mnoga
        String slowo2 = "bottle"; // liczba pojedyncza

        while (iloscButelek >= 0) {
            if (iloscButelek > 1) {
                System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
                System.out.println(iloscButelek + " " + slowo + " of beer.");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");
                System.out.println("------------------");
            } else if (iloscButelek == 1){
                System.out.println(iloscButelek + " " + slowo2 + " of beer on the wall");
                System.out.println(iloscButelek + " " + slowo2 + " of beer.");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");
                System.out.println("------------------");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
            iloscButelek--;
        } // koniec while
    } // koniec metody main
} // koniec klasy