public class FastenersRepo {

    Fastener f;
    int i = 0;
    Fastener[] fasteners;

    FastenersRepo (int size){
        fasteners = new Fastener[size];
    }

    void add(Fastener fastener){
        fasteners[i] = fastener;
        i++;
    }

    void search(/*int norm,*/ int diameter, int length){
        for (int j = 0; j < fasteners.length; j++) {
            if (/*norm == fasteners[j].norm && */diameter == fasteners[j].diameter && length == fasteners[j].length){
                f = fasteners[j];
                f.display();
            }
        }
    }
}

