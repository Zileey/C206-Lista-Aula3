import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para entrada de dados
        int op; // Opção de número de alunos
        System.out.println("Digite o número de alunos matriculados:");
        op = sc.nextInt();

        switch (op){ // Switch varia de acordo com o valor da variável op
            case 10:
                System.out.println("Sua sala será I-15!");
                break;

            case 20:
                System.out.println("Sua sala será I-15!");
                break;

            case 30: // Aparece quando digita o numero de alunos em 30
                System.out.println("Sua sala será I-22!");
                break;

            default: // Aparece quando há qualquer outra opção
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}
