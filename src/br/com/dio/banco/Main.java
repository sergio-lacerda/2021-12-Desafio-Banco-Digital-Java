package br.com.dio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setNome("Cliente Teste");
        c.setCpf(1111111111);

        Conta cc = new ContaCorrente(c);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(c);
        cp.depositar(55);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("Tranferindo R$ 50 para a conta poupança...");
        System.out.println("");
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
