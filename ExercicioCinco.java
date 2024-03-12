//Escreva instruções para realizar cada uma das tarefas a seguir:
//Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
//Solicite que o usuário insira um inteiro.
//Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler um valor digitado pelo usuário.
//Imprima “Este é um programa em Java" em uma linha na janela de comando. Use o método System.out.println.
//Imprima “Este é um programa em Java" em duas linhas na janela de comando. Utilize o método System.out.printf e dois especificadores de formato %s.

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        int c, thisIsAVariable, q76354, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um inteiro: ");
        int value = input.nextInt();

        System.out.println("Este é um programa em Java");
        System.out.printf("Este é um programa em Java%n%s%n", "Este é um programa em Java");
    }
}
