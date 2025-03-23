
package com.financeiro.financeiro;

public class Receber extends Financeiro implements InterfaceCadastro {
    private Cliente cliente;
    private String nota_fiscal;

    public Receber(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setNotaFiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getNotaFiscal() {
        return this.nota_fiscal;
    }

    @Override
    public void entrar() {
        super.entrar();
        
        this.nota_fiscal = this.leia.lerTexto("Digite a nota fiscal: ");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        
        System.out.println("Nota fiscal: " + this.nota_fiscal);
    }
}
