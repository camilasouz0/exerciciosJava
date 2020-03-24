
package aulas;
import java.util.*;
/**
 * @author camila
 */
public class questao04 {
    
    public static void ordenar(int[]num){
        int aux = 0;
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                if (num[i] < num[j]){
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
    }
    
    public static void mostrar(int []num){
        for (int i = 0; i < num.length; i++) {

            System.out.print("\n"+num[i]);
        }
    }
    
    public static void main(final String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int n = 3;
        int num[] = new int[n];
        int aux = 0, i, j;
        
        for (i = 0; i < n; i++) {
            System.out.print("Insira o " + (i + 1) + "° número: ");
            num[i] = entrada.nextInt();

	} 
        System.out.print("\nORDENADO: ");
        ordenar(num);
        mostrar(num);
    }
        
}
