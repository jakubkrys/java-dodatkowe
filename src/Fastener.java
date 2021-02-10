public class Fastener {
    int norm;
    String articleGroup;
    int diameter;
    int length;
    String material;
    String surfaceTreatment;
    boolean availability;

    Fastener(int norm, String articleGroup, int diameter, int length, String material, String surfaceTreatment, boolean availability) {
        this.norm = norm;
        this.articleGroup = articleGroup;
        this.diameter = diameter;
        this.length = length;
        this.material = material;
        this.surfaceTreatment = surfaceTreatment;
        this.availability = availability;
    }

    void display(){
        System.out.println("Norm: "+norm);
        System.out.print("Article number: ");
        if (diameter < 10 && length < 100){
            System.out.println(articleGroup+"."+"0"+(diameter*10)+"."+"0"+length);
        } else if (diameter >= 10 && length < 100){
            System.out.println(articleGroup+"."+(diameter*10)+"."+"0"+length);
        } else if (diameter < 10 && length >= 100){
            System.out.println(articleGroup+"."+"0"+(diameter*10)+"."+length);
        } else {
            System.out.println(articleGroup+"."+(diameter*10)+"."+length);
        }
        System.out.println("Material: "+material);
        System.out.println("Surface treatment: "+surfaceTreatment);
        System.out.println("On stock: "+availability);
        System.out.println("-------------------------------");
    }
}
