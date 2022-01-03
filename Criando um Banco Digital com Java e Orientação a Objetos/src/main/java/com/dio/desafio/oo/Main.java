package com.dio.desafio.oo;


public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente();

        System.out.println("======================= Lista de Clientes ============================");
        cliente.setNome("Paulo Roberto");
        cliente.setRg("xx-12.456.789");
        cliente.setCpf("987.654.321-90");
        banco.clientes(cliente);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cesar Gomes");
        cliente2.setRg("dd-12.456.789");
        cliente2.setCpf("287.654.321-90");
        banco.clientes(cliente2);

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Silvio Filho");
        cliente3.setRg("aa-12.456.789");
        cliente3.setCpf("087.654.321-90");
        banco.clientes(cliente3);
        System.out.println("======================================================================");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente2);
        Conta cp2 = new ContaPoupanca(cliente3);

        cc.getAgencia();
        cc.getNumeroConta();
        cc.deposito(100);
        cc.sacar(50);
        cc.transferir(cp, 30);
        cc.dadosInfoConta();

        cp.getAgencia();
        cp.getNumeroConta();
        cp.deposito(100);
        cp.sacar(50);
        cp.transferir(cp2, 34);
        cp.dadosInfoConta();

        cp2.getAgencia();
        cp2.getNumeroConta();
        cp2.deposito(100);
        cp2.transferir(cc, 30);
        cp2.dadosInfoConta();

    }
}
