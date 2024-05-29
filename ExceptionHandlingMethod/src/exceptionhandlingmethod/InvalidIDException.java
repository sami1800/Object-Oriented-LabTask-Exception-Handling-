
package exceptionhandlingmethod;

/**
 *
 * @author SAMI KHAN
 */
public class InvalidIDException extends Exception {
    private String message;
    
    public InvalidIDException(String message){
        this.message=message;
    }

    @Override
    public String toString() {
        return "InvalidIDException{" + "message=" + message + '}';
    }
    
}
