package funciones;

public class Coche {

/*    ***Segunda parte:
    Crear una clase coche.
    Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    Una función que incremente el número de puertas que tiene el coche.
    Crear un objeto miCoche en el main y añadirle una puerta.
    Mostrar el número de puertas que tiene el objeto.*/

    int numeroPuertas = 6;

    public int incrementarPuertas(int masPuertas){
        numeroPuertas =  numeroPuertas +  masPuertas ;
        return numeroPuertas;
    }

}

