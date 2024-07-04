public abstract class Conta implements IConta {

    //variaveis
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    //atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //contrutor
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //Métodos GET
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void sacar(double valor){
        this.saldo =- valor;

    }

    @Override
    public      void depositar(double valor){
        this.saldo =+ valor;
    }

    protected void imprimirInfosComuns (){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
