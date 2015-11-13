
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int valor1;
    
    private int limite;
    


/**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int lim)
    {
        limite = lim;
        valor1 = 0;
        
    }    
/**
*  método setter que fija el valor actual del display al valor pasado como parámetro
*/
   public void setValue(int val1) {
     if (val1 < limite && val1 >= 0) {
        valor1 = val1;   
     }
}
/**
* método que devuelve el valor actual del display en forma de cadena de 2 caracteres
*/
    public String getDisplayValue(){
 String val1 = valor1 + "";
  if ((valor1 < 10) && (valor1 > 0)){
       val1 = "0" + val1;
 }
 return val1;
}
}