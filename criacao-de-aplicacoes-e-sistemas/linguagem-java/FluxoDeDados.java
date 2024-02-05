import java.util.Scanner;

public class FluxoDeDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2;
        double quociente, potencia;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        quociente = (double) num1 / num2;
        potencia = Math.pow(num1, num2);

        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Potência do primeiro número pelo segundo: " + potencia);

        scanner.close();
    }
}
