import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número de Zumbis mortos nas últimas 3 partidas");
        int numZumbi1 = entrada.nextInt();
        int numZumbi2 = entrada.nextInt();
        int numZumbi3 = entrada.nextInt();

        int soma;
        int media;

        soma = numZumbi1 + numZumbi2 + numZumbi3;
        media = soma/3;

        System.out.println("A soma das últimas partidas é de: " + soma);
        System.out.println("A média é de: " + media);


    }
}
