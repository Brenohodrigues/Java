
package com.financeiro.financeiro;

public class Fornecedor extends PessoaJuridica implements InterfaceCadastro {
    private double limite_compra;
    private String data_cadastro;
    private String site;

    public double getLimiteCompra() {
        return this.limite_compra;
    }

    public void setLimiteCompra(double limite_compra) {
        this.limite_compra = limite_compra;
    }

    public String getDataCadastro() {
        return this.data_cadastro;
    }

    public void setDataCadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getSite() {
        return this.site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public void entrar() {
        super.entrar();

        this.limite_compra = this.leia.lerDecimal("Digite o limite de compra: ");

        this.data_cadastro = this.leia.lerData("Digite a data de cadastro: ");

        this.site = this.leia.lerTexto("Digite a URL do site: ");
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Limite de compra: " + this.limite_compra);
        System.out.println("Data de cadastro: " + this.data_cadastro);
        System.out.println("Site: " + this.site);
    }
}
