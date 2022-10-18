package recur1;

public class E10 {

    public static void main(String[] args) {
        /*Crea un método que imprima por pantalla un Triángulo 
        rectángulo a partir del valor de la altura del triángulo*/
        //tamaño del triángulo
        int n = 5;
        //tipo de triángulo: 1-creciente 2-decreciente
        int tipo = 1;
        if (tipo == 1) {
            tri_tipo1(n);
        } else if (tipo == 2) {
            tri_tipo2(n);
        }
    }
    //crea los elementos de cada fila
    static void trian(int n) {
        if (n > 0) {
            System.out.print("* ");
            trian(n - 1);
        } else {
            System.out.println();
        }
    }
    //triángulo rectángulo creciente
    static void tri_tipo1(int n) {
        if (n > 0) {
            tri_tipo1(n - 1);
            trian(n);
        }
    }
    //triángulo rectángulo decreciente
    static void tri_tipo2(int n) {
        if (n > 0) {
            trian(n);
            tri_tipo2(n - 1);
        }
    }
}