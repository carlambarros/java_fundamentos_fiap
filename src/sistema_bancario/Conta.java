package sistema_bancario;

import java.io.Serializable;

/**
 * Classe que abstrai uma conta Bancária
 * @author Carla Barros
 * @version 1.0
 */

public class Conta implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta() {

    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    // Geração de doc é com /**
    /**
     * Depositar da classe Conta
     * @param valor a ser depositado
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    /**
     * Retira um valor do Saldo da conta
     * @param valor que será retirado
     * @see #depositar(double)
     */
    public void retirar(double valor) {
        this.saldo -= valor;
    }

    /**
     * Verifica o Saldo da Conta
     * @return Valor do Saldo da Conta
     */
    public double getSaldo() {
        return this.saldo;
    }
}
