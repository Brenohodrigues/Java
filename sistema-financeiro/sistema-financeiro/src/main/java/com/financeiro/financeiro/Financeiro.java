/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.financeiro.financeiro;

public abstract class Financeiro implements InterfaceCadastro {
    private int id;
    private int numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;
    private double total;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getEmissao() {
        return this.emissao;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getVencimento() {
        return this.vencimento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getPagamento() {
        return this.pagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getJuros() {
        return this.juros;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getMulta() {
        return this.multa;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total;
    }

    @Override
    public void entrar() {
        this.id = this.leia.lerInteiro("Digite o ID: ");

        this.numero = this.leia.lerInteiro("Digite o número: ");

        this.emissao = this.leia.lerTexto("Digite a data de emissão: ");

        this.vencimento = this.leia.lerTexto("Digite a data de vencimento: ");

        this.pagamento = this.leia.lerTexto("Digite a data de pagamento: ");

        this.valor = this.leia.lerDecimal("Digite o valor: ");

        this.juros = this.leia.lerDecimal("Digite o valor de juros: ");

        this.multa = this.leia.lerDecimal("Digite o valor da multa: ");

        this.desconto = this.leia.lerDecimal("Digite o valor do desconto: ");

        this.total = this.valor + this.juros - this.desconto;
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + this.id);
        System.out.println("Número: " + this.numero);
        System.out.println("Emissão: " + this.emissao);
        System.out.println("Vencimento: " + this.vencimento);
        System.out.println("Pagamento: " + this.pagamento);
        System.out.println("Valor: " + this.valor);
        System.out.println("Juros: " + this.juros);
        System.out.println("Multa: " + this.multa);
        System.out.println("Desconto: " + this.desconto);
        System.out.println("Total: " + this.total);
    }
}
