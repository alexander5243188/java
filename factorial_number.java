public class factorial_number {
    public static void main (String[] args){
        // valor para la operacion del factorial
        int numero = 5;

        // inicializar el factorial en 1
        long factorial = 1;

        for (int i = 1; i < numero; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de "+numero+ " = "+factorial);
    }
}
