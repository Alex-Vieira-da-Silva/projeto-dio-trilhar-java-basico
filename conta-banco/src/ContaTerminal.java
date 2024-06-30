import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        try {

            // TODO: Obter pelo o scanner os valores digitado no terminal.
            Scanner scanner = new Scanner(System.in);

            // TODO: Exibir as mensagens para nosso usuário.
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.next();

            System.out.println("Por favor, digite o número da Conta !");
            numero = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Por favor, digite o Nome do cliente !");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Valor !");
            String saldoInput = scanner.next();
            saldo = Double.parseDouble(saldoInput.replace(",", "."));

            // TODO: Exibir a mensagem da conta criada.
            System.out.println("Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

            scanner.close();

        } catch (InputMismatchException expVerificaCampoNumeroESaldo) {
            System.out.println("Os campos numero e saldo prescisam se numericos.");
        } catch (NumberFormatException expVerificarCampoSaldo) {
            System.out.println("O campo saldo prescisa se numerico.");
        } catch (Exception expVerificarCampos) {
            System.out.println("Ocorreu um erro. Verifique se os valores inseridos estão corretos.");
        }

    }
}
