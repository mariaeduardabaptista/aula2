package Programas;

import java.util.InputMismatchException;
import java.util.Scanner;

import Classes.Aluno;

public class ProgramaAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("hhh");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome");
        aluno.setNome (ler.nextLine());

        try{
            System.out.println("Digite o CPF:");
        aluno.setCpf (ler.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Encerrando, pois sem CPF nao da pra continuar!");
            ler.close();
            return;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Cpf nulo. Utilizando o cpf padrao 000.000.000-00");
            aluno.setCpf("00000000000");
        }
         try{
             System.out.println("digite a idade");
              aluno.setIdade(ler.nextInt());
         } catch (InputMismatchException e) {
           System.out.println(e.getMessage()); 
           System.out.println("A idade padrao e 18 anos");
           aluno.setIdade(18);
         }
        ler.close();

        System.out.println(aluno);
    }
    
}


 