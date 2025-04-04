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

        Barco barcos[];
        barcos = new Barco[3]; //creando un arreglo de nombre barcos y lo inicalizo con 3 elementos
        /*
         * barcos[0]
         * barcos[1]
         * barcos[2]
         */
        System.out.println();
        DeVapor deVapor = new DeVapor();
        Velero velero = new Velero();
        Carguero carguero = new Carguero();
        Revista revista = new Revista();

        System.out.println();
        //barcos[0].alarma(); hay un error porque el elemento 0 del arreglo barcos esta vacion
        //barcos[0]= revista; hay un error porque no puede converir un objeto revista en un obeto barco
                             //porque revista no pertenece a la jerarquia de clases de barco
        barcos[0]= deVapor; //asignado un objero de la clase DeVapor al elemento 0 del arreglo barcos
        barcos[1]= velero;
        barcos[2]= carguero;

        for (int l=0;l<3;l++){
            barcos[l].alarma();
        }













        
    }
    
}
