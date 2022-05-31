package JavaBanc;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("** EXTRATO DA CONTA CORRENTE " + super.getnConta() + " **");
        super.infoSaldoComuns();
    }

    @Override
    public void dadosBancarios() {
        System.out.println("** DADOS BANCÁRIOS **");
        super.infoComuns();
    }

}
