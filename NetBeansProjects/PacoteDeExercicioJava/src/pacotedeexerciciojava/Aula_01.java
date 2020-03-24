
package pacotedeexerciciojava;//pacote em que a classe Aula_01 está contida

//import java.util.Scanner; //import do pacote scanner
import java.util.*; //todas as classes dentro do pacote java.util devem ser utilizados
/**ctrl+r para renomear
 * @author camila
 */
public class Aula_01 {//Aula_01 é a classe
    //dentro da classe ficam os metodos
    //void não retorna valor
    public static void main(String[] args) {// é o metodo principal informa o ponto de inicio
        
        Scanner entrada = new Scanner(System.in);
        
        double base, altura, areaRetangulo;
        System.out.println("Digite o valor da base");
        base = entrada.nextDouble();
        
        System.out.println("Digite o valor da altura");
        altura = entrada.nextDouble();
        areaRetangulo= (base*altura)/2;
        
        System.out.println("resultado é:"+areaRetangulo);
    }
}
