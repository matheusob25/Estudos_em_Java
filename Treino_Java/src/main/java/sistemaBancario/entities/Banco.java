package sistemaBancario.entities;

public class Banco {
    private long numeroConta;
    private String nome;
    private double extrato;

    public Banco(long numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getExtrato() {
        return extrato;
    }
    public void deposito(double extrato){
        this.extrato += extrato;
    }
    public void saque(double extrato){
        this.extrato -= (extrato + 5);
    }

    @Override
    public String toString() {
        return "Account: " + numeroConta +
                ", Holder: " + nome +
                ", balance: $ " + String.format("%.2f", extrato);
    }
}
