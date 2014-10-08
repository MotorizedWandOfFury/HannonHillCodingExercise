/**
 * Assumptions:
 * Class will only handle integer values
 * Class will never deal with any value larger than the maximum int value
 * 
 */

package src;

/**
 *
 * @author Ping
 */
public class HannonHillCodingExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Secret returnMe = (int x) -> x;
        
        Secret add5Divide2 = (int x) -> {
            x += 5;
            x /= 2;
            return x;
        };
        
        System.out.print("Is returnMe additive? ");
        System.out.println(FunctionCheck.isAdditiveFunction(returnMe, 100));
        
        System.out.print("Is add5Divide2 additive? "); 
        System.out.println(FunctionCheck.isAdditiveFunction(add5Divide2, 4));
        
    }
    
}
