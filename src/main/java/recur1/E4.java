package recur1;

public class E4 {

    public static void main(String[] args) {
        /*Crea un método que obtenga la cantidad de dígitos de un número N. 
        Se debe pasar como parámetro el número N*/
        int n = 1111;
        System.out.println(n + " tiene " + digi(n) + " dígitos");
    }
    //método que devuelve la cantidad de dígitos de num, num debe ser positivo
    //ejemplo: num = 1111 -> 4
    //ejemplo: num = 45895 -> 5
    static int digi(int num) {
        if (num <= 0) {
            return 0;
        }
        return 1 + digi(num / 10);
    }
}
