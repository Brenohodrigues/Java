
package com.financeiro.financeiro;

public class Endereco implements InterfaceCadastro {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return this.cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    @Override
    public void entrar() {
        this.logradouro = this.leia.lerTexto("Digite o logradouro: ");

        this.numero = this.leia.lerTexto("Digite o número: ");

        this.complemento = this.leia.lerTexto("Digite o complemento: ");

        this.bairro = this.leia.lerTexto("Digite o bairro: ");

        this.cidade = this.leia.lerTexto("Digite a cidade: ");

        this.estado = this.leia.lerTexto("Digite o estado: ");

        this.cep = this.leia.lerInteiro("Digite o CEP: ");
    }

    @Override
    public void imprimir() {
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Número: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
    }
}
