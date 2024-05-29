
package exceptionhandlingseven;

/**
 *
 * @author SAMI KHAN
 */
public class ExceptionHandlingSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1;
        try{
            if(a==1)
                throw new NumberFormatException();
            else
                throw new ArithmeticException();
            
        } catch(ArithmeticException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
    
}
