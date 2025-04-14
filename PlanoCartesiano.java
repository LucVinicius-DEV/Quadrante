// Este programa le as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas (X,Y) de um ponto no sistema cartesiano: ");
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
            
            System.out.println("Digite as coordenadas (X,Y) de um ponto no sistema cartesiano: ");
            x = sc.nextInt();             
            y = sc.nextInt();
           
        }
            

        sc.close();
    }
}
