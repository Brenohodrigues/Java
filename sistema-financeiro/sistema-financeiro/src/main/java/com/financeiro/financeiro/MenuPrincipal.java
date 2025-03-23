
package com.financeiro.financeiro;

import java.util.HashMap;
import java.util.Map;

public class MenuPrincipal {
    Entrada leia = new Entrada();

    private Cliente cliente;
    private Fornecedor fornecedor;
    private Funcionario funcionario;
    private Receber receber;
    private Pagar pagar;

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Receber getReceber() {
        return this.receber;
    }

    public void setReceber(Receber receber) {
        this.receber = receber;
    }
    
    public static void main(String[] args) {
        MenuPrincipal menu = new MenuPrincipal();

        while (true) {
            System.out.println("");

            int cadastro = menu.menu();

            System.out.println("");

            if (cadastro == 6) {
                menu.exibirFluxoDeCaixa();

                continue;
            }

            if (cadastro == 7) {
                break;
            }

            String acao = menu.submenu(cadastro);

            System.out.println("");

            switch (cadastro) {
                case 1:
                    switch (acao) {
                        case "a":
                            menu.funcionario = new Funcionario();
                            menu.funcionario.entrar();
                            break;
                        case "b":
                            if (menu.funcionario == null) {
                                System.out.println("Não existe um funcionário cadastrado.");
                            } else {
                                menu.funcionario.entrar();
                            }
                            break;
                        case "c":
                            if (menu.funcionario == null) {
                                System.out.println("Não existe um funcionário cadastrado.");
                            } else {
                                menu.funcionario.imprimir();
                            }
                            break;
                        case "d":
                            if (menu.funcionario == null) {
                                System.out.println("Não existe um funcionário cadastrado.");
                            } else {
                                menu.funcionario = null;

                                System.out.println("Funcionário excluído com sucesso.");
                            }
                            break;
                    }
                    break;
                case 2:
                    switch (acao) {
                        case "a":
                            menu.cliente = new Cliente();
                            menu.cliente.entrar();
                            break;
                        case "b":
                            if (menu.cliente == null) {
                                System.out.println("Não existe um cliente cadastrado.");
                            } else {
                                menu.cliente.entrar();
                            }
                            break;
                        case "c":
                            if (menu.cliente == null) {
                                System.out.println("Não existe um cliente cadastrado.");
                            } else {
                                menu.cliente.imprimir();
                            }
                            break;
                        case "d":
                            if (menu.cliente == null) {
                                System.out.println("Não existe um cliente cadastrado.");
                            } else if (menu.receber != null) {
                                System.out.println("Não foi possível excluir o fornecedor pois ele está sendo utilizado na conta à pagar.");
                            } else {
                                menu.cliente = null;

                                System.out.println("Cliente excluído com sucesso.");
                            }
                            break;
                    }
                    break;
                case 3:
                    switch (acao) {
                        case "a":
                            menu.fornecedor = new Fornecedor();
                            menu.fornecedor.entrar();
                            break;
                        case "b":
                            if (menu.fornecedor == null) {
                                System.out.println("Não existe um fornecedor cadastrado.");
                            } else {
                                menu.fornecedor.entrar();
                            }
                            break;
                        case "c":
                            if (menu.fornecedor == null) {
                                System.out.println("Não existe um fornecedor cadastrado.");
                            } else {
                                menu.fornecedor.imprimir();
                            }
                            break;
                        case "d":
                            if (menu.fornecedor == null) {
                                System.out.println("Não existe um fornecedor cadastrado.");
                            } else if (menu.pagar != null) {
                                System.out.println("Não foi possível excluir o fornecedor pois ele está sendo utilizado na conta à pagar.");
                            } else {
                                menu.fornecedor = null;

                                System.out.println("Fornecedor excluído com sucesso.");
                            }
                            break;
                    }
                    break;
                case 4:
                    switch (acao) {
                        case "a":
                            if (menu.cliente == null) {
                                System.out.println("É necessário cadastrar um cliente para cadastrar uma conta à receber.");
                            } else {
                                menu.receber = new Receber(menu.cliente);
                                menu.receber.entrar();
                            }
                            break;
                        case "b":
                            if (menu.receber == null) {
                                System.out.println("Não existe uma conta à receber cadastrada.");
                            } else {
                                menu.receber.entrar();
                            }
                            break;
                        case "c":
                            if (menu.receber == null) {
                                System.out.println("Não existe uma conta à receber cadastrada.");
                            } else {
                                menu.receber.imprimir();
                            }
                            break;
                        case "d":
                            if (menu.receber == null) {
                                System.out.println("Não existe uma conta à receber cadastrada.");
                            } else {
                                menu.receber = null;

                                System.out.println("Conta à receber excluída com sucesso.");
                            }
                            break;
                    }
                    break;
                case 5:
                    switch (acao) {
                        case "a":
                            if (menu.fornecedor == null) {
                                System.out.println("É necessário cadastrar um fornecedor para cadastrar uma conta à receber.");
                            } else {
                                menu.pagar = new Pagar(menu.fornecedor);
                                menu.pagar.entrar();
                            }
                            break;
                        case "b":
                            if (menu.pagar == null) {
                                System.out.println("Não existe uma conta à pagar cadastrada.");
                            } else {
                                menu.pagar.entrar();
                            }
                            break;
                        case "c":
                            if (menu.pagar == null) {
                                System.out.println("Não existe uma conta à pagar cadastrada.");
                            } else {
                                menu.pagar.imprimir();
                            }
                            break;
                        case "d":
                            if (menu.pagar == null) {
                                System.out.println("Não existe uma conta à pagar cadastrada.");
                            } else {
                                menu.pagar = null;

                                System.out.println("Conta à pagar excluída com sucesso.");
                            }
                            break;
                    }
                    break;
            }
        }
    }

    public int menu() {
        Map<String, String> opcoes;
        opcoes = new HashMap();
        opcoes.put("1", "Cadastro de Funcionários");
        opcoes.put("2", "Cadastro de Clientes");
        opcoes.put("3", "Cadastro de Fornecedores");
        opcoes.put("4", "Contas a Receber");
        opcoes.put("5", "Contas a Pagar");
        opcoes.put("6", "Fluxo de Caixa");
        opcoes.put("7", "Sair");

        String entrada = this.leia.lerOpcaoDeMenu(opcoes);

        return Integer.parseInt(entrada);
    }
    
    public String submenu(int opcao) {
        Map<String, String> opcoes;
        opcoes = new HashMap();
        opcoes.put("a", "Incluir");
        opcoes.put("b", "Alterar");
        opcoes.put("c", "Consultar");
        opcoes.put("d", "Excluir");

        return this.leia.lerOpcaoDeMenu(opcoes);
    }
    
    private void exibirFluxoDeCaixa() {
        double totalDebito = 0;
        double totalCredito = 0;
        double saldo = 0;

        if (this.receber != null) {
            totalCredito += this.receber.getTotal();
            saldo += this.receber.getTotal();

            System.out.println("Vencimento: " + this.receber.getVencimento());
            System.out.printf("Débito: R$ %.2f\n", this.receber.getTotal());
            System.out.println("Crédito: R$ 0,00");
            System.out.printf("Saldo: R$ %.2f\n", saldo);
            System.out.println("-----------------------------------------");
        }

        if (this.pagar != null) {
            totalDebito -= this.pagar.getTotal();
            saldo -= this.pagar.getTotal();

            System.out.println("Vencimento: " + this.pagar.getVencimento());
            System.out.println("Débito: R$ 0,00");
            System.out.printf("Crédito: R$ %.2f\n", this.pagar.getTotal());
            System.out.printf("Saldo: R$ %.2f\n", saldo);
            System.out.println("-----------------------------------------");
        }

        System.out.println("");
        System.out.println("Totais:");
        System.out.printf("Débido: R$ %.2f\n", totalDebito);
        System.out.printf("Crédito: R$ %.2f\n", totalCredito);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
