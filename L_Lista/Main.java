package L_Lista;

public class Main {
    
    public static void main (String[] args) {
        System.out.println("Partiti!");
        
        Lista l = new Lista();
        System.out.println( l );

        /* 
        for (int i=0; i<10; i++) {
            l.addHead( new Nodo( i, null ));
        }
        l.addHead(new Nodo(2024, null));
        */

        l.addSorted(new Nodo(300, null));
        l.addSorted(new Nodo(320, null));
        l.addSorted(new Nodo(250, null));
        l.addSorted(new Nodo(180, null));
        l.addSorted(new Nodo(350, null));
        System.out.println( l );
    } 

}
