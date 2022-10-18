package recur1;

public class E14 {

    public static void main(String[] args) {
        /*Crea un método que compruebe si un número es binario. 
        Un número binario está formado únicamente por ceros y unos*/
        //valor del número analizado
        int num = 1001010;
        if (enBinario(num)) {
            System.out.println("El número está en binario");
        } else {
            System.out.println("El número no está en binario");
        }
    }
    //método que comprueba si n está en binario
    //ejemplo: n = 101011 -> true
    static boolean enBinario(int n) {
        if (n > 9) {
            if (n % 10 == 0 || n % 10 == 1) {
                return enBinario(n / 10);
            } else {
                return false;
            }
        } else if (n == 0 || n == 1) {
            return true;
        } else {
            return false;
        }
    }
}