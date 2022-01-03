package com.dio.desafio.oo;

public interface Transacoes {
    double valor = 0;

    void sacar(double valor);
    void deposito(double valor);
    void transferir(Conta contaDestino, double valor);
    void extrato();
}
