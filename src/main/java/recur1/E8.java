package recur1;

public class E8 {

    public static void main(String[] args) {
        /*Crea un método que dado un número, lo imprima invertido por pantalla*/
        //numero a invertir
        int n = 1234;
        inv(n);
    }
    //método que dado un número, lo imprime por pantalla invertido
    //ejemplo: n = 1234 -> 4321
    static void inv(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            inv(n / 10);
        }
    }
}