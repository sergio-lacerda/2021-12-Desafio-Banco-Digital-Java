package br.com.dio.banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cli) {
        super(cli);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("========== Conta Poupança ==========");
        super.imprimirDadosConta();
    }
}
