import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro Numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo Numero");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }

    };

    static void contar(int num1, int num2) throws ParametrosInvalidosException {

        if (num1 >= num2) {
            throw new ParametrosInvalidosException();
        }

        int resultado = num2 - num1;

        for (int i = 0; i < resultado; i++) {
            
            System.out.println(i+1);
        }
    }
}
