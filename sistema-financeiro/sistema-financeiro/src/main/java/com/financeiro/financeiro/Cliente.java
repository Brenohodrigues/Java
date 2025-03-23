
package com.financeiro.financeiro;

public class Cliente extends PessoaJuridica implements InterfaceCadastro {
    private double limite_credito;
    private Endereco endereco_cobranca;

    public Cliente() {
        this.endereco_cobranca = new Endereco();
    }

    public double getLimiteCredito() {
        return this.limite_credito;
    }

    public void setLimiteCredito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public Endereco getEnderecoCobranca() {
        return this.endereco_cobranca;
    }

    public void setEnderecoCobranca(Endereco endereco_cobranca) {
        this.endereco_cobranca = endereco_cobranca;
    }

    @Override
    public void entrar() {
        super.entrar();

        this.limite_credito = this.leia.lerDecimal("Digite o limite de crédito: ");

        System.out.println("\n[Endereço de cobrança]\n");

        this.endereco_cobranca.entrar();
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Limite de crédito: " + this.limite_credito);

        System.out.println("\n[Endereço de cobrança]\n");

        this.endereco_cobranca.imprimir();
    }
}
