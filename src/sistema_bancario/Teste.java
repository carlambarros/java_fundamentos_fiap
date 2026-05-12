package sistema_bancario;

public class Teste {
    public static void main(String[] args){

        Conta c1 = new Conta();
        c1.depositar(1000);
        c1.retirar(100);

        ContaCorrente c2 = new ContaCorrente();
        c2.depositar(1000);
        c2.retirar(100);

        Conta c3 = new ContaCorrente();
        c3.depositar(1000);
        c3.retirar(100);

        System.out.println("Conta 1: " + c1.getSaldo());
        System.out.println("Conta 2: " + c2.getSaldo());
        System.out.println("Conta 3: " + c3.getSaldo());

    }
}
