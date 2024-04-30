import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta = 0;
        String numeroAgencia = "";
        String nome = "";
        double saldo = 0.0;

        System.out.println("Bem Vindo ao Banco XBank!");
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência: ");
        numeroAgencia = scanner.next();
        System.out.println("Por favor, digite o seu nome: ");
        nome = scanner.next();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Ola "+nome+", obrigado por criar uma conta em nosso banco, sua agencia e "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" ja esta disponivel para saque.");

    }
}
