import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        carregaDados();
    }

    private static void carregaDados() {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // TODO: Obter pelo o scanner os valores digitado no terminal.
        Scanner scanner = new Scanner(System.in);

        try {
            // TODO: Exibir as mensagens para nosso usuário.
            exibirMensagem("Por favor, digite o número da Agência !");
            agencia = scanner.next();

            exibirMensagem("Por favor, digite o número da Conta !");
            numero = scanner.nextInt();
            scanner.nextLine();

            exibirMensagem("Por favor, digite o Nome do cliente !");
            nomeCliente = scanner.nextLine();

            exibirMensagem("Por favor, digite o Valor !");
            String saldoInput = scanner.next();
            saldo = Double.parseDouble(saldoInput.replace(",", "."));

            // TODO: Exibir a mensagem da conta criada.
            System.out.println("Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (InputMismatchException expVerificaCampoNumeroESaldo) {
            System.out.println("Os campos número e saldo precisam ser numéricos.");
        } catch (NumberFormatException expVerificarCampoSaldo) {
            System.out.println("O campo saldo precisa ser numérico.");
        } catch (Exception expVerificarCampos) {
            System.out.println("Ocorreu um erro. Verifique se os valores inseridos estão corretos.");
        } finally {
            scanner.close();
        }
    }

    private static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
