
package exceptionhandlingfour;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author SAMI KHAN
 */
public class ExceptionHandlingFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int[] marks=new int[5];
            for(int i=0;i<5;i++){
                System.out.println("Enter number ");
                marks[i]=sc.nextInt();
            }
        }catch(InputMismatchException e){
            System.out.println("Enter correct number ");
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Error is "+err);
        }
        finally{
            System.out.println("Executed");
        }
        
    }
    
}
