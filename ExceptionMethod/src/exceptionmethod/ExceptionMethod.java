
package exceptionmethod;
import java.util.Scanner;
/**
 *
 * @author SAMI KHAN
 */
public class ExceptionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age ");
        int a=sc.nextInt();
        try{
            if(a<0)
                throw new Exception("Age must be psoitive");
            if(a>25)
                throw new Exception("you are over age ");
            if(a<18)
                throw new Exception("You are underage ");
        }catch(Exception e){
            String message=e.getMessage();
            System.out.println(message);
            System.exit(0);
        }
        
    }
    
}
