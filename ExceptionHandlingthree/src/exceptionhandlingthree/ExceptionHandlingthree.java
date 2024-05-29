
package exceptionhandlingthree;
import java.util.InputMismatchException;

import java.util.Scanner;
/**
 *
 * @author SAMI KHAN
 */
public class ExceptionHandlingthree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            int[] marks=new int[5];
            for(int i=0;i<=5;i++){
                System.out.println("Array["+i+"]=");
                marks[i]=sc.nextInt();
            }
        }catch(InputMismatchException e){
            System.out.println("Enter correct number");
        }catch(ArrayIndexOutOfBoundsException er){
            System.out.println("this error is "+er);
        }
        
    }
    
}
