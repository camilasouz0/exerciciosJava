
package aulas;

import java.util.*;
/**
 * @author camila souza
 */
public class questao03 {
    
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("DIGITE O PESO:");
        float peso = entrada.nextFloat();
        
        System.out.println("DIGITE A ALTURA");
        float altura = entrada.nextFloat();
        
        double result = (double) (peso/Math.pow(altura,2));
        
        if(result<18.5){
            
            System.out.println("\nVOCÊ ESTÁ ABAIXO DO PESO.");
            
        }else if(result>18.5 && result<25){
            
            System.out.println("\nPESO NORMAL");
            
        }else if(result>25 && result<30){

            System.out.println("\nACIMA DO PESO");
            
        }else if(result>30){

            System.out.println("\nOBESO");
            
        }else{
            
            System.out.println("Escolha invalida.");
        }
    }
}
