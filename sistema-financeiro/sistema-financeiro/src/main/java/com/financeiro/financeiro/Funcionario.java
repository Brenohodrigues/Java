
package com.financeiro.financeiro;

public class Funcionario extends PessoaFisica implements InterfaceCadastro {
    private String data_admissao;
    private String data_demissao;
    private String ctps;
    private double salario;

    public String getDataAdmissao() {
        return this.data_admissao;
    }

    public void setDataAdmissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public String getDataDemissao() {
        return this.data_demissao;
    }

    public void setDataDemissao(String data_demissao) {
        this.data_demissao = data_demissao;
    }

    public String getCtps() {
        return this.ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void entrar() {
        super.entrar();

        this.data_admissao = this.leia.lerData("Digite a data de admissão: ");

        this.data_demissao = this.leia.lerData("Digite a data de demissão: ");

        this.ctps = this.leia.lerTexto("Digite o CTPS: ");

        this.salario = this.leia.lerDecimal("Digite o salário: ");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        
        System.out.println("Data de admissão: " + this.data_admissao);
        System.out.println("Data de demissão: " + this.data_demissao);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salário: " + this.salario);
    }
}
