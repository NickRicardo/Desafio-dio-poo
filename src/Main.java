public class Main {

    public static void main(String[] args) {
        Cliente nicolas = new Cliente();
        nicolas.setNome("Nícolas Santos");

        Conta cc = new ContaCorrente(nicolas);
        Conta poupanca = new ContaPoupanca(nicolas);

        cc.depositar(10000.00);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
