package sistema_bancario;

public interface Iconta {
     void depositar(double valor);
     void sacar(double valor);
     void transferir(Conta contaDestino, double valor);

     void imprimirExtrato();
}
