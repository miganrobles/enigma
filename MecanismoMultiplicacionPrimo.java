
/**
 * Write a description of class MecanismoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{   
    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int num)
    {
        super(num);
    }
    
    /**
     * Método que encripta el número pasado como parámetro
     * Devuelve el número encriptado
     */
    @Override
    public int encripta(int numero)
    {
        return getNum() * numero;
    }
    
    /**
     * Método que desencripta el número pasado como parámetro
     * Devuelve el número desencriptado
     */
    @Override
    public int desencripta(int numero)
    {
        return numero / getNum();
    }
}
