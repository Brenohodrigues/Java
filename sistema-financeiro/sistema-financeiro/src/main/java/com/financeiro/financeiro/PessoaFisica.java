
package com.financeiro.financeiro;

public abstract class PessoaFisica extends Pessoa implements InterfaceCadastro {
    private String cpf;
    private String rg;
    private String emissor;

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmissor() {
        return this.emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    @Override
    public void entrar() {
        super.entrar();

        this.cpf = this.leia.lerTexto("Digite o CPF: ");

        this.rg = this.leia.lerTexto("Digite o RG: ");

        this.emissor = this.leia.lerTexto("Digite o emissor do RG: ");
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Emissor do RG: " + this.emissor);
    }
}
