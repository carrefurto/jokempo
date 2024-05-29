import java.util.Random;
import java.util.Scanner;

public class Jokempo {
    public static void main(String[] args) {

        int escolhaJogador, escolhaComputador;

        Scanner leitor = new Scanner(System.in);


        System.out.println("--------------------------------");
        System.out.println("          J O K E M P Ô         ");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("1 - PEDRA");
        System.out.println("2 - PAPEL");
        System.out.println("3 - TESOURA");
        System.out.println();


        try {
            Random sorteador = new Random();

            System.out.print("Qual a sua escolha? (1 - 3) ");
            escolhaJogador = leitor.nextInt();
            escolhaComputador = sorteador.nextInt(3) + 1;

            System.out.printf("Escolha do Jogador: %s \n", definirNomeEscolha(escolhaJogador));
            System.out.printf("Escolha do Computador: %s ", definirNomeEscolha(escolhaComputador));

            definirVencedor(escolhaJogador, escolhaComputador);
            escolherNumero(leitor);

        } catch (Exception error){
            System.out.println("A sua escolha deve ser um NÚMERO entre 1 e 3");
        }

    }
    private static void escolherNumero (Scanner leitor) {
        int escolhaJogador;

        do {
            escolhaJogador = leitor.nextInt();
            if (escolhaJogador < 1 || escolhaJogador > 3) {
                System.out.println("A sua escolha deve ser entre 1 e 3");
            } else {
                break;
            }
        } while (true);

    }

    private static String definirNomeEscolha(int opcao) {

        String escolhaString;

        if (opcao == 1) {
            escolhaString = "PEDRA";
        } else if (opcao == 2) {
            escolhaString = "PAPEL";
        } else {
            escolhaString = "TESOURA";
        }


        return escolhaString;

    }

    private static void definirVencedor (int escolhaJogador,  int escolhaComputador){

        if (escolhaJogador == 1) {
            if (escolhaComputador == 1){
                System.out.println("\nO JOGO EMPATOU ");
            } else if (escolhaComputador == 2) {
                System.out.println("\nO COMPUTADOR VENCEU!");
            } else {
                System.out.println("\nO HUMANO VENCEU!!");
            }
        } else if (escolhaJogador == 2) {
            if (escolhaComputador == 2){
                System.out.println("\nO JOGO EMPATOU ");
            } else if (escolhaComputador == 3) {
                System.out.println("\nO COMPUTADOR VENCEU!");
            } else {
                System.out.println("\nO HUMANO VENCEU!!");
            }
        }
        else {
            if (escolhaComputador == 3){
                System.out.println("\nO JOGO EMPATOU ");
            } else if (escolhaComputador == 1) {
                System.out.println("\nO COMPUTADOR VENCEU!");
            } else {
                System.out.println("\nO HUMANO VENCEU!!");
            }

       }
        System.exit(0);
    }
}