package Programas;

import java.util.Scanner;
import Classes.Maca;

public class ProgramaMaca { 
    public static void main(String[] args) {
        Maca maca = new Maca();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de maças:");
        maca.setQuantidade(ler.nextInt());
        System.out.println("O valor total é: R$" + maca.getValorTotal());
        System.out.printf("Voce comprou %d maças e cada uma saiu por R$ %.2f", maca.getQuantidade(), maca.getValorUnitario()) ;
        ler.close();


    }
    
}
