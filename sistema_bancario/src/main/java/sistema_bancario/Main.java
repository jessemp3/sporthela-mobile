package sistema_bancario;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poup = new ContaPoupanca();

        cc.imprimirExtrato();

    }
}