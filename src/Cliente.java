import java.sql.SQLOutput;

public class Cliente {
    // Atributos privados
    private String titular; // Nome do titular da conta
    private double saldo; // Saldo da conta

    // Construtor para inicializar a conta com um titular e saldo inicial
    public Cliente(String titular, double saldoInicial) {
        this.titular = titular; // Define o nome do titular
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial; // Define o saldo inicial se for um valor positivo
        } else {
            this.saldo = 0; // Se o saldo inicial for negativo, inicializa com 0
        }
    }

    // Método Getter para acessar o nome do titular (não pode alterar, apenas consultar)
    public String getTitular() {
        return titular;
    }

    // Método Getter para acessar o saldo (somente leitura)
    public double getSaldo() {
        return saldo;
    }

    public void depositar (double valor) {
        if (valor > 0) { // Apenas permite depósito se o valor for positivo
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor de depósito deve ser positivo.");
        }
    }

    // Método para realizar um saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) { // Verifica se o valor é positivo e suficiente
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }
}
