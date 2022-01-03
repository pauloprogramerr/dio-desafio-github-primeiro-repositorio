package com.dio.desafio.oo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
abstract class Conta implements Transacoes{

    protected static int CONTA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numeroConta;
    protected Cliente cliente;
    protected double saldo;
    protected boolean teste = false;


    public Conta(Cliente cliente) {
        this.agencia = Conta.CONTA_PADRAO++;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }
    @Override
    public void sacar(double valor){
        teste = true;
        sacarOuTransferir(null, valor);
    }
    @Override
    public void transferir(Conta contaDestino, double valor) {
        sacarOuTransferir(contaDestino, valor);

}
    // metodo de validação de saque ou transferência, caso seja menor
    public void sacarOuTransferir(Conta contaDestino, double valor){

        if((saldo > 0 && !teste && valor <= saldo)){
            this.sacar(valor);
            contaDestino.deposito(valor);

        }else if((saldo > 0 && teste && valor <= saldo)){
            this.saldo -= valor;
        }else
            SaldoInsuficiente.saldoNegativo();
    }

    protected void dadosInfoConta() {
        System.out.print(String.format("Titular:.%s", this.cliente.getNome()));
        System.out.print(String.format("\tAgência Nº%d", this.agencia));
        System.out.print(String.format("\tConta número Nº%d", this.numeroConta));
        System.out.print(String.format("\tSaldo R$%.2f", this.saldo));
        System.out.println();
    }
}
