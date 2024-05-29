
package exceptionhandlingmethod;
import java.util.Scanner;

/**
 *
 * @author SAMI KHAN
 */
public class ExceptionHandlingMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name;
        String id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter id ");
        id=sc.next();
        try{
            verifyID(id);
        }catch(InvalidIDException e){
            System.out.println(e);
        }
        
    }
    public static void verifyID(String id) throws InvalidIDException{
        if(id.length()!=6)
            throw new InvalidIDException("Check length of id");
        try{
            Long.parseLong(id);
        }
        catch(Exception e){
            throw new InvalidIDException("ID should have digit");
        }
    }
    
}
