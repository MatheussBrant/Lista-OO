 class ContaBancaria {
    double saldo;
}

public class exercicio20 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.saldo = 1000;

        depositar(conta, 500);

        System.out.println("Saldo: " + conta.saldo);
    }

    public static void depositar(ContaBancaria conta, double valor) {
        conta.saldo += valor;
    }
}
