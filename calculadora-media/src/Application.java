import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int sum = 0;
        int totalNumbers = 0;

        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());

                if (input == 0) { // El programa te deja introducir todos los números que quieras, pero si introduces un '0' entonces se acaba y te calcula la media de todos los números introducidos.
                    System.out.println("La media de tus números es " + (sum / totalNumbers + "."));
                    break;
                }

                totalNumbers = totalNumbers + 1;
                sum += input;
                System.out.println("Introduce otro número.");
            }

            catch (NumberFormatException e) { // Esto hace que solo puedas introducir números en formato integer.
                System.out.println("Introduce un número válido.");
            }
        }

    }
}
