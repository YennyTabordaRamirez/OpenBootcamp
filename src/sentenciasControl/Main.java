package sentenciasControl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

/*  En este ejercicio practicarás las estructuras de control, para ello deberás crear:
    Usando un if, crear una condición que compare si la variable numero If es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
    el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.
    Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
    que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se
    ejecute y deberá mostrarse por pantalla.
    Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
    estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
    consola informando de la estación en la que está. También habrá que poner un default para cuando
    el valor de la variable no sea una estación.*/

    public static void main(String[] args) {
        //conocerTipoNumero(-5);
        //cicloWhile(0);
        //cicloDoWhile(4);
        //cicloFor(6);
        Scanner sc= new Scanner(System.in);
        int estacion;
        do{
            System.out.print("Para saber la estación del año, digite: 1, 2, 3 ó 4. Digite 0 para salir ---> ");
            estacion = sc.nextInt();
            switchCase(estacion);
        }while (estacion != 0);
    }

    public static void switchCase(int estacion){
        switch (estacion){
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                System.out.println("La estación es invierno");
                break;
            case 2:
                System.out.println("La estación es primavera");
                break;
            case 3:
                System.out.println("La estación es verano");
                break;
            case 4:
                System.out.println("La estación es otoño");
                break;
            default:
                System.out.println("Opción incorrecta. Intente de nuevo.");
        }

    }

    public static void cicloFor(int numero){
        int numeroAEvaluar=-2;
        System.out.println("El número arranca en "+ numeroAEvaluar);
        for (int i = 1; i <= numero; i++) {
            if (numeroAEvaluar <= 3){
                numeroAEvaluar++;
                System.out.println("El número ha incrementado a "+ numeroAEvaluar);
            }
        }
        System.out.println("El número " + numeroAEvaluar+ " no cumple la condición. Debe ser menor o igual a 3.");
    }
    public static void cicloDoWhile(int numero){
        int numeroAumentado=0;
        System.out.println("El número arranca en "+ numero);
        do {
            numero++;
            System.out.println("El número ha incrementado a "+ numero);
        }while (numeroAumentado == numero);
    }

    public static void cicloWhile(int numero){
        System.out.println("El número arranca en "+ numero);
        while (numero < 3){
            numero++;
            System.out.println("El número ha incrementado a "+ numero);
        }
        System.out.println("El número " + numero+ " no cumple la condición. Debe ser menor a 3.");
    }

    public static void conocerTipoNumero(int numero){
        if(numero != 0 && numero < 0){
            System.out.println("El número " + numero + " es negativo.");
        }else if(numero != 0 && numero > 0){
            System.out.println("El número " + numero + " es positivo.");
        }else
            System.out.println("El número es " + numero+".");

    }
}
