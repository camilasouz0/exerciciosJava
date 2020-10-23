
package project;

import java.util.Scanner;
import java.util.Random;

public class Project {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
    
        banco minhaConta = new banco();
        minhaConta.iniciar();
    }
    
}
