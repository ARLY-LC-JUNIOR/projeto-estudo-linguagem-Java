import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            Ms jogo = new Ms();
            String posicao;
            int valida = 0, Jogadas = 0;

            while (true) {
                System.out.println("+++++Jogo Da Velha+++++");
                jogo.Mostrar();

                do {// inicia o primeiro jogador
                    System.out.print("Jogador 1, informe a posição: ");
                    posicao = ler.next();
                    while (!((Ms) jogo).Valido(posicao)) {
                        System.out.println("Jogada Invalida, Escolha Outra Posição!!!");
                        System.out.print("Jogador 1, informe a posição: ");
                        posicao = ler.next();
                        valida = 0;
                    }
                    jogo.jogada(posicao, "X");
                    valida = 1;

                } while (valida == 0);// fim primeiro jogador

                Jogadas++;
                valida = 0;
                jogo.Mostrar();
                if (!jogo.Ganhou(Jogadas).equals("null")) {
                    break;
                }

                do {// inicia o segundo jogador
                    System.out.print("Jogador 2, informe a posição: ");
                    posicao = ler.next();
                    while (!jogo.Valido(posicao)) {
                        System.out.println("Jogada Invalida, Escolha Outra Posição!!!");
                        System.out.print("Jogador 2, informe a posição: ");
                        posicao = ler.next();
                        valida = 0;
                    }
                    ((Ms) jogo).jogada(posicao, "O");
                    valida = 1;

                } while (valida == 0);// fim segundo jogador

                Jogadas++;
                valida = 0;
                jogo.Mostrar();
                if (!jogo.Ganhou(Jogadas).equals("null")) {
                    break;
                }

            }
            System.out.println("O " + jogo.Ganhou(Jogadas) + " Venceu!");
        }

    }

}
