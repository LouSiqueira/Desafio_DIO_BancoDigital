import JavaBanc.Cliente;
import JavaBanc.Conta;
import JavaBanc.ContaCorrente;
import JavaBanc.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Cliente Louise = new Cliente();
        Louise.setNome("Louise");
        Cliente Juliano = new Cliente();
        Juliano.setNome("Juliano");
        Conta c1 = new ContaCorrente(Juliano);
        Conta c2 = new ContaPoupanca(Louise);


        c1.depositar(10);
        c2.depositar(50);
        c1.sacar(5);
        c2.transferir(60,c1);

        c1.extrato();
        c2.extrato();

        c1.dadosBancarios();
        c2.dadosBancarios();


    }
}
