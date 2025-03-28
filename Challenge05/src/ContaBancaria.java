public abstract class ContaBancaria implements Conta {
    protected double Saldo;

    @Override
    public void consultarSaldo() {
        System.out.println("Seu valor em conta é: " + Saldo);
    }
}
