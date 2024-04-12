package desafio3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();


        //Funcionarios
        funcionarios.add(new Funcionario("João", 5000.00, 150.0));
        funcionarios.add(new Funcionario("Lucas", 3000.00, 100.0));

        //Detalhes dos funcionarios
        funcionarios.forEach(System.out::println);

        //Aumento de salario em funcionario aleatorio
        Random random = new Random();
        int indiceFuncionarioAleatorio = random.nextInt((funcionarios.size()));
        funcionarios.get(indiceFuncionarioAleatorio).aumentoSalario(10.0);

        //Detalhes
        System.out.println("\nDetalhe dos funcionários após aumento salarial de 10% para o funcionário"
                + (indiceFuncionarioAleatorio + 1) + ":");
        funcionarios.forEach(System.out::println);

        //Salario liquido dos funcionarios
        System.out.println("\nSalário liquido dos funcionário: ");
        for (Funcionario func : funcionarios) {
            System.out.println("Funcionário" + func.getNomeDoFuncionario() + " : R$ " + String.format("%.2f", func.obterSalarioLiquido()));
        }

    }
}

