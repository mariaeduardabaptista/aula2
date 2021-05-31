package Programas;

import Classes.Aluno;

public class Programa2 { 
    public static void main(String[] args) {
        Aluno aluno1, aluno2;

        aluno1 = new Aluno(); 
        aluno1.setNome("Duda");
        System.out.println("Aluno 1" + aluno1);
        aluno2 = new Aluno();
        aluno2.setNome("Davi");
        System.out.println("Aluno 2" + aluno2);
        aluno1 = aluno2;
        System.out.println("Aluno 1" + aluno1);
        System.out.println("Aluno2" + aluno2);
        aluno1.setCpf("12345678900");
        System.out.println("Aluno 1" + aluno1);
        System.out.println("Aluno2" + aluno2);
        aluno2.setIdade(15);
        System.out.println("Aluno 1" + aluno1);
        System.out.println("Aluno2" + aluno2);
        valor1 = 10;
        valor2 = 15;
        System.out.println("Valor 1: " + valor1 + "valor 2" + valor2);
        valor1 = valor2;
        System.out.println("Valor 1: " + valor1 + "valor 2" + valor2);
        valor1 = 5;
        System.out.println("Valor 1: " + valor1 + "valor 2" + valor2);
        




    }

}
