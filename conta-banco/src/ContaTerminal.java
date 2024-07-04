import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        criarConta();
    }

    static void criarConta() {

        // TODO: Obter pelo o scanner os valores digitado no terminal.
        Scanner terminal = new Scanner(System.in);

        try {
            // TODO: Exibir as mensagens para nosso usuário.
            exibirMensagem("Por favor, digite o número da Agência !");
            String agencia = terminal.next();

            exibirMensagem("Por favor, digite o número da Conta !");
            int numero = terminal.nextInt();
            terminal.nextLine();

            exibirMensagem("Por favor, digite o Nome do cliente !");
            String nomeCliente = terminal.nextLine();

            exibirMensagem("Por favor, digite o Valor !");
            String saldoInput = terminal.next();
            double saldo = Double.parseDouble(saldoInput.replace(",", "."));

            // TODO: Exibir a mensagem da conta criada.
            System.out.println("Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (InputMismatchException ExceptionVerificaCampoNumeroESaldo) {
            System.out.println("Os campos número e saldo precisam ser numéricos.");
        } catch (NumberFormatException ExceptionVerificarCampoSaldo) {
            System.out.println("O campo saldo precisa ser numérico.");
        } catch (Exception ExceptionVerificarCampos) {
            System.out.println("Ocorreu um erro. Verifique se os valores inseridos estão corretos.");
        } finally {
            terminal.close();
        }
    }

    static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
