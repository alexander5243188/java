import java.util.Scanner;

class reverse_string {
        public static void main(String[] args){
        
        // creamos la variable para ingreso de datos
        Scanner ingresoDato = new Scanner(System.in);

        //solicitamos que ingrese el valor
        System.out.println("Ingrese una cadena de texto: ");

        // almacenamos lo que el  usuario digito
        String ingresoCadena = ingresoDato.nextLine();

        // variable, con la cadena de texto
       // String cadena = "Hello World";
       String cadena = ingresoCadena;

        //variable con la cadena invertida
        String cadenaInversa = new StringBuilder(cadena).reverse().toString();
        
        System.out.println("Cadena invertida: " + cadenaInversa);        
        }        
}
