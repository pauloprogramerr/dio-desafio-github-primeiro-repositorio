package com.dio.desafio.oo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public List clientes (Cliente c) {
        List<Cliente> client = new ArrayList<>();
        // adicionando clientes a lista
        client.add(c);


        // imprime a lista de clientes
        for (Cliente cli: client) {
            System.out.println(cli);
        }
        return client;
    }
}
