package com.dio.desafio.oo;

public class SaldoInsuficiente extends Exception{
    public static void saldoNegativo(){
            System.err.println("Sem saldo desponivel, tente mais tarde.");
    }
}

