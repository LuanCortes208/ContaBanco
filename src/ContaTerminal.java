import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.print("Agência: ");
        String agencia = sc.next();

        System.out.print("Nome do Cliente: ");
        String nome_cliente = sc.next();

        System.out.print("Saldo: ");
        sc.nextLine();
        double saldo = sc.nextDouble();

        System.out.printf("Olá , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e "
         + "seu saldo %f já está disponível para saque", agencia, numero, saldo
        );
    }
}
