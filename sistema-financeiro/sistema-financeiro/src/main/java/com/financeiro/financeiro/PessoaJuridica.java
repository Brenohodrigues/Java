
package com.financeiro.financeiro;

public abstract class PessoaJuridica extends Pessoa implements InterfaceCadastro {
    private String cnpj;
    private String inscricao_estadual;
    private String contato;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricao_estadual;
    }

    public void setInscricaoEstadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public void entrar() {
        super.entrar();

        this.cnpj = this.leia.lerTexto("Digite o CNPJ: ");

        this.inscricao_estadual = this.leia.lerTexto("Digite a Inscrição Estadual: ");

        this.contato = this.leia.lerTexto("Digite o nome do contato: ");
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricao_estadual);
        System.out.println("Contato: " + this.contato);
    }
}
