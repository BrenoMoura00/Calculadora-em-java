import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para começar a calculadora escolha a opção a baixo");
        System.out.println("==================");
        System.out.println("\"escola uma opção\n" +
                "\"(1)Soma \n" +
                "\"(2)Multiplicação\n" +
                "\"(3)Divisão\n" +
                "\"(4)Subtração\n");
        int opcao = scanner.nextInt();
        if (opcao > 4) {
            System.out.println("Opção inválida");
        }
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = 0;

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção Soma ");
                resultado = numero1 + numero2;
                break;
            case 2:
                System.out.println("Você escolheu a opção Multiplicação ");
                resultado = numero1 * numero2;
                break;
            case 3:
                System.out.println("Você escolheu a opção Divisão ");
                resultado = numero1 / numero2;
                break;
            case 4:
                System.out.println("Você escolhe a opção Subtração");
                resultado = numero1 - numero2;
                break;
        }
        System.out.println("O resultado é :" + resultado);
    }
}