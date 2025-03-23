
package com.financeiro.financeiro;

import java.util.Scanner;

public class Telefone implements InterfaceCadastro {
    private int ddd;
    private long numero;

    public int getDdd() {
        return this.ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        this.ddd = this.leia.lerInteiro("Digite o DDD: ");

        this.numero = this.leia.lerInteiroLongo("Digite o número: ");
    }

    @Override
    public void imprimir() {
        System.out.println("DDD: " + this.ddd);
        System.out.println("Número: " + this.numero);
    }
}
