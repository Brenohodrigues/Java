
package com.financeiro.financeiro;

public abstract class Pessoa implements InterfaceCadastro {
    protected int id;
    protected String nome;
    protected Endereco endereco;
    protected Telefone telefone;
    protected String email;

    public Pessoa() {
        this.endereco = new Endereco();
        this.telefone = new Telefone();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return this.telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public void entrar() {
        this.id = this.leia.lerInteiro("Digite o id: ");

        this.nome = this.leia.lerTexto("Digite o nome: ");

        this.email = this.leia.lerTexto("Digite o email: ");

        this.endereco.entrar();

        this.telefone.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);

        this.endereco.imprimir();
        this.telefone.imprimir();
    }
}
