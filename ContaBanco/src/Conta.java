import java.util.Scanner;

public class Conta {
Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

    protected void criacaoConta(){
     System.out.println("Vamos iniciar a criação da conta: ");

     System.out.println("Digite seu Nome:");
     nomeCliente =  scan.nextLine();

     System.out.println("Por favor, digite o número da Agência !");
     agencia =  scan.nextLine();


    System.out.println("Digite Numero da Conta: ");
    numero = scan.nextInt();

    

    System.out.println("Digite seu saldo: ");
    saldo = scan.nextDouble();

    System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco!");
    System.out.println("Sua agência é: " + agencia);
    System.out.println("Conta: " + numero);
    System.out.println("Saldo: " + saldo + " já está disponivel para saque. ");
    
    }


    
}
