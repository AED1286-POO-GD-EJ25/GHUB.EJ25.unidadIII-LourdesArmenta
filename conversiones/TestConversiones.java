package conversiones;

public class TestConversiones {
    public static void main(String[] args) {
        int i = 5;
        System.out.println("contenido de i ="+i);
        double j = (double)i; //converion explicitada
        System.out.println("contenido de j ="+j);

        double x = 3.1416;
        int y = (int)x; //converion explicita
        System.out.println("contenido de x ="+x);
        System.out.println("contenido de y ="+y);

        Double k = new Double(3.1416);
        System.out.println("contenido de k: "+k);

        //int l = (int)k; esta conversion no es posible
        //Revista pb = (Revista)l; converion no es posible

        Barco mr;
        Velero v = new Velero();
        DeVapor w = new DeVapor();
        mr = v; //conversion automatica
        mr = w ; //conversion automatica

        Barco b1;
        DeVapor wt;
        Carguero c = new Carguero();
        b1 = c; // converion automatica
        wt = c; //conversion automarica









        
    }
    
}
