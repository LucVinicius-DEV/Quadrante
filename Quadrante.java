
// Descrição: Este programa lê coordenadas (X, Y) de uma quantidade indeterminada de pontos no sistema cartesiano
// e imprime a qual quadrante cada ponto pertence. O programa encerra quando pelo menos uma das coordenadas for 0.

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
