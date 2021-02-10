import java.util.Scanner;

public class FastenersCatalogMAIN {

    public static void main(String[] args) {

        String stal = "Stal";
        String ocynk = "Ocynk";
        String imbusocynk = "07160";
        String hexaocynk = "01210";

        FastenersRepo fastenersRepo = new FastenersRepo(20);
        Fastener f1 = new Fastener(912, imbusocynk,6, 20, stal, ocynk, true);
        Fastener f2 = new Fastener(912, imbusocynk,6, 40, stal, ocynk, true);
        Fastener f3 = new Fastener(912, imbusocynk,6, 60, stal, ocynk, true);
        Fastener f4 = new Fastener(912, imbusocynk,8, 40, stal, ocynk, true);
        Fastener f5 = new Fastener(912, imbusocynk,8, 80, stal, ocynk, true);
        Fastener f6 = new Fastener(912, imbusocynk,8, 120, stal, ocynk, true);
        Fastener f7 = new Fastener(912, imbusocynk,10, 100, stal, ocynk, true);
        Fastener f8 = new Fastener(912, imbusocynk,10, 160, stal, ocynk, true);
        Fastener f9 = new Fastener(912, imbusocynk,10, 200, stal, ocynk, true);
        Fastener f10 = new Fastener(912, imbusocynk,10, 300, stal, ocynk, true);
        Fastener f11 = new Fastener(933, hexaocynk,6, 20, stal, ocynk, true);
        Fastener f12 = new Fastener(933, hexaocynk,6, 40, stal, ocynk, true);
        Fastener f13 = new Fastener(933, hexaocynk,6, 60, stal, ocynk, true);
        Fastener f14 = new Fastener(933, hexaocynk,8, 40, stal, ocynk, true);
        Fastener f15 = new Fastener(933, hexaocynk,8, 80, stal, ocynk, true);
        Fastener f16 = new Fastener(933, hexaocynk,8, 120, stal, ocynk, true);
        Fastener f17 = new Fastener(933, hexaocynk,10, 100, stal, ocynk, true);
        Fastener f18 = new Fastener(933, hexaocynk,10, 160, stal, ocynk, true);
        Fastener f19 = new Fastener(933, hexaocynk,10, 200, stal, ocynk, true);
        Fastener f20 = new Fastener(933, hexaocynk,10, 300, stal, ocynk, true);

        fastenersRepo.add(f1);
        fastenersRepo.add(f2);
        fastenersRepo.add(f3);
        fastenersRepo.add(f4);
        fastenersRepo.add(f5);
        fastenersRepo.add(f6);
        fastenersRepo.add(f7);
        fastenersRepo.add(f8);
        fastenersRepo.add(f9);
        fastenersRepo.add(f10);
        fastenersRepo.add(f11);
        fastenersRepo.add(f12);
        fastenersRepo.add(f13);
        fastenersRepo.add(f14);
        fastenersRepo.add(f15);
        fastenersRepo.add(f16);
        fastenersRepo.add(f17);
        fastenersRepo.add(f18);
        fastenersRepo.add(f19);
        fastenersRepo.add(f20);

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Podaj normę DIN (liczba):");
        int norm = scanner.nextInt();*/
        System.out.println("Podaj średnicę (w mm):");
        int diameter = scanner.nextInt();
        System.out.println("Podaj długość (w mm):");
        int length = scanner.nextInt();

        fastenersRepo.search(/*norm, */diameter, length);



    }
}
