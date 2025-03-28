public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(100);
        contaPoupanca.consultarSaldo();
        // tem q mostrar 0.99 por causa do 1%

        contaCorrente.depositar(200);
        contaCorrente.consultarSaldo();
        // tem q mostrar o valor cheio
    }
}
