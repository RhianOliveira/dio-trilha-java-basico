import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o Nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agencia é " + agencia + ", conta " + numero
                + " e seu saldo " + saldo + " ja esta disponivel para saque.");
        scanner.close();
    }
}