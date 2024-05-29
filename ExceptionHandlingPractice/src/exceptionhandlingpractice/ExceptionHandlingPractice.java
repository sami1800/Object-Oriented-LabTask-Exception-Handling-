
package exceptionhandlingpractice;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 *
 * @author SAMI KHAN
 */
public class ExceptionHandlingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
       String input;
       try{
           System.out.println("Enter any line");
           input=in.readLine();
           
       }catch(IOException e){
           System.out.println(e);
       }
       
       
    }
    
}
