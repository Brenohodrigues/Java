
package com.financeiro.financeiro;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Entrada {
    private Scanner scanner;

    public Entrada() {
        this.scanner = new Scanner(System.in);
    }

    public String lerData(String texto, boolean obrigatorio) {
        while (true) {
            System.out.print(texto);

            String entrada = this.scanner.nextLine();

            if (entrada.isBlank() && ! obrigatorio) {
                return entrada;
            }

            String[] itens = entrada.split("/");

            if (itens.length == 3) {
                if (itens[0].length() == 2 && itens[1].length() == 2 && itens[2].length() == 4) {
                    return entrada;
                }
            }

            System.out.println("Entrada inválida: Informe a data no formato DD/MM/YYYY.");
            System.out.println("");
        }
    }

    public String lerData(String texto) {
        return this.lerData(texto, false);
    }

    public String lerTexto(String texto) {
        System.out.print(texto);
        return this.scanner.nextLine();
    }

    public double lerDecimal(String texto) {
        while (true) {
            System.out.print(texto);

            try {
                double entrada = this.scanner.nextDouble();

                scanner.nextLine();

                return entrada;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida: Informe um número decimal.");
                System.out.println("");

                scanner.nextLine();
            }
        }
    }
    
    public int lerInteiro(String texto) {
        while (true) {
            System.out.print(texto);

            try {
                int entrada = this.scanner.nextInt();

                scanner.nextLine();

                return entrada;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida: Informe um número.");
                System.out.println("");

                scanner.nextLine();
            }
        }
    }

    public long lerInteiroLongo(String texto) {
        while (true) {
            System.out.print(texto);

            try {
                long entrada = this.scanner.nextLong();

                scanner.nextLine();

                return entrada;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida: Informe um número.");
                System.out.println("");

                scanner.nextLine();
            }
        }
    }

    public String lerOpcao(String texto, String[] opcoes) {
        while (true) {
            System.out.print(texto);

            String entrada = this.scanner.nextLine();

            for (String opcao : opcoes) {
                if (opcao.equals(entrada)) {
                    return entrada;
                }
            }

            System.out.println("Opção inválida.");
            System.out.println("");
        }
    }

    public String lerOpcaoDeMenu(Map<String, String> opcoes) {
        for (Map.Entry<String, String> opcao : opcoes.entrySet()) {
            System.out.printf("%s) %s\n", opcao.getKey(), opcao.getValue());
        }

        System.out.println("");

        String[] opcoesArray = opcoes.keySet().toArray(new String[0]);

        return this.lerOpcao("Escolha uma opção: ", opcoesArray);
    }
}
