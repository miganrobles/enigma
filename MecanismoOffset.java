
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{    
    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int num)
    {
        super(num);       
    }
    
    /**
     * Método que encripta el número pasado como parámetro
     * Devuelve el número encriptado
     * se elige un número a de 1 a 9. Se obvia el primer dígito del número original y, para el resto de dígitos, 
     * se incrementa en a cada dígito; si el resultado es mayor que 10, se considera solo el último dígito del resultado. 
     * Para descencriptar se sigue el proceso inverso, obviando el primer dígito.
     */
    @Override
    public int encripta(int numero)
    {
        String numeroString = Integer.toString(numero);
        String numeros = "" + numeroString.charAt(0);
        int digito = 0;
        for (int i = 1; i < numeroString.length(); i++) {
            digito = Integer.parseInt("" + numeroString.charAt(i));
            digito = (digito + getNum()) % 10;
            numeros += Integer.toString(digito);
        }       
        return Integer.parseInt(numeros);
    }
    
    /**
     * Método que desencripta el número pasado como parámetro
     * Devuelve el número desencriptado
     */
    @Override
    public int desencripta(int numero)
    {
        String numeroString = Integer.toString(numero);
        String numeros = "" + numeroString.charAt(0);
        int digito = 0;
        for (int i = 1; i < numeroString.length(); i++) {
            digito = Integer.parseInt("" + numeroString.charAt(i));
            digito = (digito - getNum() + 10) % 10;
            numeros += Integer.toString(digito);
        }       
        return Integer.parseInt(numeros);
    }
}
