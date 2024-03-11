/*
 * la serie fibonaci:
 *   indice   0 1 2 3 4 5 6  7  8  9 10 11
 *   valor    0,1,1,2,3,5,8,13,21,34,55,89
 */
public class fibonacci_series {
    public static void main(String[] args){
        // declarar variable para el limite de la serie
        int limiteSerieFibonaci = 4;

        //declarar variaba base que tenga el valor de 0 de la serie
        int valorInicial = 0;

        // declarar variable acumulador, de las sumas de la serie
        int valorAcumulado = 1;

        // mensaje descriptivo de la serie
        System.out.println("Fibonaci de "+ limiteSerieFibonaci+" numeros");


        // ciclo para que inicia en 1, porque se tiene el valor cero dentro de la varibale valorInicial
        for (int i = 1; i <= limiteSerieFibonaci; i++) {

            // mensaje inicial de 0 +, desde donde se parte la serie
            System.out.print(valorInicial + " + ");

            // declarar variable que realize la suma de valorInicial y valorAcumulado (0+1 = 1)
            int suma = valorInicial + valorAcumulado;

            // asignamos el valorAcumulado(1) en valorInicial(0) (0 tendra el valor de 1) --> valorAcumulado(1), valorInicial(1)
            valorInicial = valorAcumulado;

            // asignamos la suma(1) a valorAcumulado(1) (1 tendra el valor de 1)
            valorAcumulado = suma;
        }

    }
}
