package HomeWork3;

public class Console {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = "";

            while (!input.equals("exit")) {
                System.out.println("Введите строку (для выхода введите 'exit'): ");
                input = scanner.nextLine();
                System.out.println("Вы ввели: " + input);
            }

            scanner.close();
        }
    }
}
