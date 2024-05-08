import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Conheceer e importar a classe Scanner

        System.out.print("Por favor, digite o número da conta: ");
        //Exibir as mensagens para o nosso usuário
        int numero = scanner.nextInt();
        //Obter pela Scanner os valores digitados no terminal

        System.out.print("Digite o número da Agência: ");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + ", " +
                "já está disponível para saque.");
        //Exibir a mensagem da conta criada
    }
}