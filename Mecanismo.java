
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int num;
    
    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int num)
    {
        this.num = num;
    }
    
    public abstract int encripta(int num);
    
    public abstract int desencripta(int num);

    /**
     * Devuelve el número que utilizamos para encriptar
     */
    public int getNum() 
    {
        return num;
    }
}

