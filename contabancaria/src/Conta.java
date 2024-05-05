public class Conta {
    private int numeroAgencia;
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    // Construtor
    public Conta(int numeroAgencia, String nomeCliente, double saldoInicial) {
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
        this.numeroConta = gerarNumeroConta(); // Método para gerar o número da conta
    }

    // Getters and setters

    // ...

    // Método para gerar o número da conta (implemente de acordo com sua lógica)
    private int gerarNumeroConta() {
        // ...
    }

    // Método para formatar o saldo (opcional)
    public String getSaldoFormatado() {
        // ...
    }
}