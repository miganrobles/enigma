
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    
    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int num)
    {
        super(num);       
    }
    
    /**
     * Método que encripta el número pasado como parámetro
     * Devuelve el número encriptado
     * Mecanismo sumatorio parcial: se elige un número a de 1 a 9. 
     * El número original x se suma al número x-1 y el resultado al x-2, etc. hasta a incluido.
     * El resultado es el número cifrado.
     */
    @Override
    public int encripta(int numero)
    {
        int numeroA = getNum();
        int numeroEncriptado = 0;
        while (numero >= numeroA) {
            numeroEncriptado += numero;
            numero--;
        }       
        return numeroEncriptado;
    }
    
    /**
     * Método que desencripta el número pasado como parámetro
     * Devuelve el número desencriptado
     */
    @Override
    public int desencripta(int numero)
    {
        int numeroA = getNum();
        while (numero > numeroA) {
            numero -= numeroA;
            numeroA++;
        }       
        return numero;
    }
}
