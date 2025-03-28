public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        double valorReal = valor * 0.99;
        Saldo += valorReal;
    }
}
