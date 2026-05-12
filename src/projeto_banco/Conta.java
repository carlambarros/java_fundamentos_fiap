package projeto_banco;

public class Conta {
    // variaveis
    int numero;
    double saldo;

    // construtor padrão, sem argumentos
    public Conta() {

    }

    // construtor com argumentos
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = 0;
    }

    // outro construtor alternativo
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    // Metodos
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero(int numero) {
        return numero;
    }

    //Cliente cliente = new Cliente();
}
