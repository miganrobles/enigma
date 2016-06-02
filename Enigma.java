


    /**Mecanismo de multiplicación por número primo: se escoge un número primo que es el que se utiliza para encriptar el número original 
     * 
     realizando una multiplicación. Para desencriptar se sigue el proceso inverso.

    Mecanismo offset: se elige un número a de 1 a 9. Se obvia el primer dígito del número original y, 
    para el resto de dígitos, se incrementa en a cada dígito; si el resultado es mayor que 10, se considera solo el último dígito del resultado. 
    Para descencriptar se sigue el proceso inverso, obviando el primer dígito.

    Mecanismo sumatorio parcial: se elige un número a de 1 a 9. El número original x se suma al número x-1 y el resultado al x-2, etc. hasta a incluido. 
    El resultado es el número cifrado.

    Enigma solo encripta/desencripta números mayores de 10; en caso de que el número a cifrar sea menor que 10, Enigma devuelve -1. Si el descifrado tampoco produce un número mayor que 10, entonces la función de descifrado devuelve -1 también.

Se pide que codifiques un programa en Java que simule la máquina Enigma y que sea capaz de pasar los siguientes tests:

/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    /**
     * Metodo para encriptar el número utilizando el mecanismo pasado como parámetro
     */
    public int encripta(Mecanismo mecanismo, int num) {
        int numDevuelve = -1;
        if (num > 10) {
            numDevuelve = mecanismo.encripta(num);
        }
        return numDevuelve;
    }
    
    /**
     * Metodo para desencriptar el número utilizando el mecanismo pasado como parámetro
     */
    public int desencripta(Mecanismo mecanismo, int num) {
        int numDevuelve = mecanismo.desencripta(num); 
        if (numDevuelve <= 10) {
            numDevuelve = -1;
        }
        return numDevuelve;
    }
}
