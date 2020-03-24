
package aulas;

import java.util.*;
/**
 * @author camila
 */
public class questao01 {
    public static void main(final String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float valorCompra, result;
        int opcao;
        
        System.out.println("DIGITE O VALOR DA SUA COMPRA:");
        
        valorCompra = entrada.nextFloat();
        
        System.out.println("\nESCOLHA A CONDIÇÃO DE PAGAMENTO: \n [1] A vista em dinhero ou cheque com 10% \n [2] A vista no cartão de credito com 15% \n [3] Em 2x preço normal de etiqueta sem juros \n [4] Em 3x preço normal de etiqueta + juros de 10%\n");
        
        opcao = entrada.nextInt();
        
        switch (opcao){
            case 1: {
                result = (float)0.1 * valorCompra;
                System.out.println("\nA compra fica pelo valor de R$ " + result);
                break;
            }
            case 2: {
                result = (float)0.15 * valorCompra;
                System.out.println("\nA compra fica pelo valor de R$ " + result);
                break;
            }
            case 3: {

                System.out.println("\nCada parcela fica pelo valor de R$ " + valorCompra);
                break;
            }
            case 4: {
                valorCompra = (float)Math.pow((valorCompra*1.1),3);
                System.out.println("\nCada parcela + juros fica pelo valor de R$ " + valorCompra);
                break;
            }
            default: {
                System.out.println("Escolha invalida.");
                break;
            }
        }
        
//        System.out.println("entre com o numero");;;;;;;;;
//        final int n1 = entrada.nextInt();
//        System.out.println("Entre com o inicio");
//        final int inicio = entrada.nextInt();
//        System.out.println("Entre com o fim");
//        for (int fim = entrada.nextInt(), i = inicio; i <= fim; ++i) {
//            System.out.println(n1 + "*" + i + "=" + n1 * i);
        
    }
}
