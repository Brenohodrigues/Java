
package com.financeiro.financeiro;

public class Pagar extends Financeiro implements InterfaceCadastro {
    private Fornecedor fornecedor;
    private String boleto;

    public Pagar(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public String getBoleto() {
        return this.boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    @Override
    public void entrar() {
        super.entrar();

        this.boleto = this.leia.lerTexto("Digite o boleto: ");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        
        System.out.println("Boleto: " + this.boleto);
    }
}
