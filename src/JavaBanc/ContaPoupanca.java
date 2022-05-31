package JavaBanc;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("** EXTRATO DA CONTA POPANÇA " + super.getnConta() + " **");
        super.infoSaldoComuns();
    }

    @Override
    public void dadosBancarios() {
        System.out.println("** SEUS DADOS BANCÁRIOS **");
        super.infoComuns();
    }
}
