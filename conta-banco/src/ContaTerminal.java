import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // TODO: Conhecer e importar a classe Scanner.
        Scanner scanner = new Scanner(System.in);

        // TODO: Exibir as mensagens para nosso usuário.
        // TODO: Obter pelo o scanner os valores digitado no terminal.
        try {
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.next();

            System.out.println("Por favor, digite o número da Conta !");
            numero = scanner.nextInt();

            System.out.println("Por favor, digite o Nome do cliente !");
            scanner.nextLine();
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Valor !");
            String saldoInput = scanner.next();
            saldo = Double.parseDouble(saldoInput.replace(",", "."));
            
            // TODO: Exibir a mensagem da conta criada.
            System.out.println("Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Verifique se os valores inseridos estão corretos.");
        } finally {
            scanner.close();
        }

    }
}
