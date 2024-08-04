import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        // Criando o Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Obtendo os coeficientes da equação
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        // Calculando o discriminante
        double delta = b * b - 4.0 * a * c;

        // Verificando as raízes
        if (delta > 0) {
            // Raízes reais distintas
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println("As raízes são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Raíz real única
            double x = -b / (2.0 * a);

            System.out.println("A raiz única é:");
            System.out.println("x = " + x);
        } else {
            // Raízes complexas
            System.out.println("As raízes são complexas.");
        }

        scanner.close();
    }
}