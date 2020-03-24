
package pacotedeexerciciojava;
import java.util.*;
/**
 * @author camila
 */
public class questao02 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("DIGITE O PESO:");
        float peso = entrada.nextFloat();
        
        System.out.println("DIGITE A ALTURA");
        float altura = entrada.nextFloat();
        
        double result = (double) (peso/Math.pow(altura,2));
        
        System.out.println("O SEU IMC É: "+ result);
    }
    
}