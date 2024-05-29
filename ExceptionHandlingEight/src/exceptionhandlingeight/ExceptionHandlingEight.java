
package exceptionhandlingeight;
import java.util.Scanner;

/**
 *
 * @author SAMI KHAN
 */
public class ExceptionHandlingEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("Enter number ");
            int a=sc.nextInt();
            int v=a/0;
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
