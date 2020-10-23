package project;

import java.util.Scanner;

public class banco {
    private int saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    
    public banco(){
        saldo=0;
        saques=0;
    }
    
    public void saldo(){
        System.out.println("\n\n\tCONSULTAR SALDO");
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
        
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double valor)
    {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("********************\n*** MENU INICIAL ***");
        System.out.println("\n>SALDO    [1]\n>SAQUE    [2]\n>DEPOSITO [3]\n>SAIR     [4]\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    saldo();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("\n\nQuanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        sacar(valor);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("\n\nQuanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    depositar(valor);
                    break;
                    
            case 4: 
                    System.out.println("Operação Finalizada!");
                    break;
                    
            default:
                    System.out.println("\n\nOpção Inválida");
        }
    }
}

