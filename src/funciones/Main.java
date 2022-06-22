package funciones;

public class Main {

/*    ***Primera parte:
    Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores.
*/

    public static void main(String[] args) {

        int resultado = sumar(3,5,8);
        System.out.println("El resultado es: "+ resultado);

        Coche miCoche = new Coche();
        int incrementar = miCoche.incrementarPuertas(2);
        System.out.println("El numero de puertas aumentado es: "+ incrementar);

    }

    public static int sumar(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
}
