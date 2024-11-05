import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int agencia;
        String conta;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência");
        agencia = ler.nextInt();

        System.out.println("Por favor, digite o número da Conta");
        conta = ler.next();

        System.out.println("Por favor, digite o nome do Cliente");
        nomeCliente = ler.next();

        System.out.println("Por favor, digite o saldo inicial");
        saldo = ler.nextDouble();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque" );



    }
}