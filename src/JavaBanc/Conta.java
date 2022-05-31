package JavaBanc;

public abstract class Conta extends Banco{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int nConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.nConta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.00;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void infoComuns(){
        System.out.println(super.getNome());
        System.out.println("Titular " + cliente.getNome());
        System.out.println("Agência " + agencia);
        System.out.println("Número da conta " + nConta);
    }

    protected void infoSaldoComuns(){
        double novoSaldo = this.getSaldo();
        if (novoSaldo<0) {
            System.out.println("SEU SALDO É NEGATIVO NO VALOR DE R$" + this.getSaldo());
        } else{
            System.out.println(" SEU SALDO É R$" + this.getSaldo());
        }
    }
}
