public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**Criação de Conta Bancária**");

        System.out.print("Por favor, digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        // Cria a conta bancária
        Conta conta = new Conta(numeroAgencia, nomeCliente, saldoInicial);

        // Exibe a mensagem final
        System.out.println("\nOlá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + conta.getNumeroAgencia() + ", conta " + conta.getNumeroConta() + " e seu saldo " +
                conta.getSaldoFormatado() + " já está disponível para saque.");

        scanner.close();
    }
}